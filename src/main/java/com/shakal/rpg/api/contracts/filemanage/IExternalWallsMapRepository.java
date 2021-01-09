package com.shakal.rpg.api.contracts.filemanage;


import java.io.File;

import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IExternalWallsMapRepository {

	/*** Given an string containing a base64 file to save and it's name, returns the identifier 
	 * @return identifier of saved file 
	 **/
	String saveWallsMapFile(File file,String fileName) throws FileManagementException;
	
	
	/*** Given the id of implementation, returns a String content of File 
	 * @return String base64 of file
	**/ 
	String retrieveWallImageFileById(String id) throws ResourceNotFoundException;
}
