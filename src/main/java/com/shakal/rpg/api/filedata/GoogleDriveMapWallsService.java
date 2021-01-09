package com.shakal.rpg.api.filedata;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.stereotype.Service;

import com.shakal.rpg.api.contracts.filemanage.IExternalWallsMapRepository;
import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.filedata.repository.GoogleDriveRepository;

@Service
public class GoogleDriveMapWallsService implements IExternalWallsMapRepository {

	private final String PNG_TYPE = "image/png";
	@Override
	public String saveWallsMapFile(File file, String fileName) throws FileManagementException {
		try {
			return GoogleDriveRepository.saveMapImageFile(file, fileName,PNG_TYPE,GoogleDriveRepository.IMAGE_PATH_WALLS_ID);
		} catch (IOException | GeneralSecurityException e) {
			throw new FileManagementException("Erro ao submeter o arquivo");
		}
	}

	@Override
	public String retrieveWallImageFileById(String id) throws ResourceNotFoundException {
		try {
			return GoogleDriveRepository.retrieveFileById(id);
		} catch (IOException | GeneralSecurityException e) {
			throw new ResourceNotFoundException("Arquivo não encontrado");
		}
	}

}
