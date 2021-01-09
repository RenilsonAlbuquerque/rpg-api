package com.shakal.rpg.api.contracts.filemanage;

import java.io.File;

import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;

public interface IExternalImageRepository {

	/*** Given the id of implementation, returns a base64 of File 
	 * @return base64 file
	**/ 
	String retrieveFileById(String id) throws ResourceNotFoundException;
	
	/*** Given an string containing a base64 file to save and it's name, returns the identifier 
	 * @return identifier of saved file 
	 **/
	String saveMapImageFile(File file,String fileName) throws FileManagementException;
	
	/*** Given the id of api, returns a ByteArrayOutputStream of File
	 *  @return base64 of /10 scaled file
	 */
	String retrieveMinimap(String fileId);
}
