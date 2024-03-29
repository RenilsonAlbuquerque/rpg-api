package com.shakal.rpg.api.filedata.service;

import java.io.File;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.filedata.enums.PathEnum;
import com.shakal.rpg.api.filedata.strategy.IExternalFileStorageStrategy;

@Service
public class ExternalMapImageService {

	@Autowired
	private IExternalFileStorageStrategy externalFileStorage;
	
	
	public String saveMapImageFile(File file, String fileName) throws FileManagementException {
		return this.externalFileStorage.saveFile(file, fileName,this.externalFileStorage.getPath(PathEnum.MAP));
	}

	
	public String retrieveFileById(String id) throws ResourceNotFoundException {
		return this.externalFileStorage.retrieveFileById(id, this.externalFileStorage.getPath(PathEnum.MAP));
	}

	
	public String retrieveMinimap(String fileId) throws ResourceNotFoundException {
		
		return this.externalFileStorage.retrieveMinimap(fileId, this.externalFileStorage.getPath(PathEnum.MAP)); 
		
	}
	
}
