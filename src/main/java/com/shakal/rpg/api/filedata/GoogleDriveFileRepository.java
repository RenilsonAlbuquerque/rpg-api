package com.shakal.rpg.api.filedata;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.shakal.rpg.api.contracts.filemanage.IExternalImageRepository;

@Service
public class GoogleDriveFileRepository implements IExternalImageRepository {

	//@Autowired
	//private GoogleDriveCredentialsConfig credConfig;
	
	@Override
	public File retrieveFileByName(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<String> getFileNames(){
		return null;
	}

}
