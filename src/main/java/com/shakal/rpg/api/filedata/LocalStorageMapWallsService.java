package com.shakal.rpg.api.filedata;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.io.File;

import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.filemanage.IExternalWallsMapRepository;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.utils.Constants;

@Service
public class LocalStorageMapWallsService implements IExternalWallsMapRepository{

	@Override
	public String saveWallsMapFile(File file, String fileName) throws FileManagementException {
		Path destinationFile = Paths.get(Constants.IMAGE_MAPS_WALLS_PATH,fileName);
		try {
			Files.write(destinationFile, Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			throw new FileManagementException("Erro ao salvar o arquivo");
		}
		
		return fileName;
	}

	@Override
	public String retrieveWallImageFileById(String id) throws ResourceNotFoundException {
		try {
			File file = new File(Constants.IMAGE_MAPS_WALLS_PATH + id);
			return "data:image/png;base64," + Base64
			          .getEncoder()
			          .encodeToString(Files.readAllBytes(file.toPath()));
		} catch (IOException e) {
			throw new ResourceNotFoundException("Arquivo não encontrado");
		}
	}
	/*
	@Override
	public String saveWallsMapFile(String content, String fileName) throws FileManagementException {
		
		Path destinationPath = Paths.get(Constants.IMAGE_MAPS_WALLS_PATH + fileName);
		try {
			Files.writeString(destinationPath, content, StandardCharsets.UTF_8);
		} catch (IOException e) {
			throw new FileManagementException("Erro ao salvar o arquivo");
		}
		
		return fileName;
	}

	@Override
	public int[] retrieveWallImageFileById(String id) throws ResourceNotFoundException {
		return null;
		//String content = Files.readString(path, StandardCharsets.US_ASCII);
	}
	*/

}
