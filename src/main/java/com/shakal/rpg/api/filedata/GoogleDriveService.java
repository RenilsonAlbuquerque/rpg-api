package com.shakal.rpg.api.filedata;


import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.filemanage.IExternalImageRepository;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.filedata.repository.GoogleDriveRepository;
import com.shakal.rpg.api.helpers.FileHelper;

@Service
public class GoogleDriveService implements IExternalImageRepository{

	private final String JPEG_TYPE = "image/jpeg";
	
	@Override
	public String saveMapImageFile(File file, String fileName) throws FileManagementException {
		try {
			return GoogleDriveRepository.saveMapImageFile(file, fileName,JPEG_TYPE,GoogleDriveRepository.IMAGE_PATH_ID);
		} catch (IOException | GeneralSecurityException e) {
			e.printStackTrace();
			throw new FileManagementException("Erro ao submeter o arquivo");
		}
	}

	@Override
	public String retrieveFileById(String id) throws ResourceNotFoundException {
		try {
			return GoogleDriveRepository.retrieveFileById(id);
		} catch (IOException | GeneralSecurityException e) {
			throw new ResourceNotFoundException("Arquivo não encontrado");
		}
	}

	@Override
	public String retrieveMinimap(String fileId) {
		
		BufferedImage img;
		BufferedImage scaledImage;
		byte[] imageBytes;
		String result = "";
		try {
			img = FileHelper.byteArrayOSToBufferedImage(GoogleDriveRepository.retrieveFileOutputStreamById(fileId));
		
			scaledImage = FileHelper.resiezeImage(img,img.getWidth()/10, img.getHeight()/10);
		
			ByteArrayOutputStream scaledImageOs = new ByteArrayOutputStream();
		
			ImageIO.write(scaledImage, "jpeg", scaledImageOs);
			imageBytes = scaledImageOs.toByteArray();
        
			result = "data:image/jpeg;base64," + Base64
		          .getEncoder()
		          .encodeToString(imageBytes);
		} catch (IOException | GeneralSecurityException e) {
			result = "";
		}
		return result;
		
	}

}
