package com.shakal.rpg.api.filedata;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.filemanage.IExternalImageRepository;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.helpers.FileHelper;
import com.shakal.rpg.api.utils.Constants;

@Service
public class LocalStorageMapService implements IExternalImageRepository {

	@Override
	public String retrieveFileById(String id) throws ResourceNotFoundException {
		try {
			File file = new File(Constants.MAPS_IMAGES_PATH + id);
			return "data:image/jpeg;base64," + Base64
			          .getEncoder()
			          .encodeToString(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			throw new ResourceNotFoundException("Arquivo não encontrado");
		}
	}

	@Override
	public String saveMapImageFile(File file, String fileName)throws FileManagementException{
				
		Path destinationFile = Paths.get(Constants.MAPS_IMAGES_PATH,fileName);
		try {
			Files.write(destinationFile, Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			throw new FileManagementException("Erro ao salvar o arquivo");
		}
		
		return fileName;
	}

	@Override
	public String retrieveMinimap(String fileId) {
		BufferedImage img;
		BufferedImage scaledImage;
		byte[] imageBytes;
		String result = "";
		try {
			img = ImageIO.read(new File(Constants.MAPS_IMAGES_PATH + fileId));
		
			scaledImage = FileHelper.resiezeImage(img,img.getWidth()/10, img.getHeight()/10);
		
		ByteArrayOutputStream scaledImageOs = new ByteArrayOutputStream();
		
		ImageIO.write(scaledImage, "jpeg", scaledImageOs);
		imageBytes = scaledImageOs.toByteArray();
        
		result = "data:image/jpeg;base64," + Base64
		          .getEncoder()
		          .encodeToString(imageBytes);
		} catch (IOException e) {
			result = "";
		}
		return result;
	}

}
