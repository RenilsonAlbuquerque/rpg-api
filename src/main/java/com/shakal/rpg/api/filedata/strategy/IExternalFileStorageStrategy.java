package com.shakal.rpg.api.filedata.strategy;

import java.io.File;

import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.exception.ResourceNotFoundException;
import com.shakal.rpg.api.filedata.enums.PathEnum;

public interface IExternalFileStorageStrategy {

	/*** Given the id of implementation, returns a base64 of File 
	 * @return base64 file
	**/ 
	String retrieveFileById(String id,String filePath) throws ResourceNotFoundException;
	
	/*** Given an string containing a base64 file to save and it's name, returns the identifier 
	 * @return identifier of saved file 
	 **/
	String saveFile(File file,String fileName,String filePath) throws FileManagementException;
	
	/*** Given the id of api, returns a ByteArrayOutputStream of File
	 *  @return base64 of /10 scaled file
	 */
	String retrieveMinimap(String fileId,String filePath) throws ResourceNotFoundException;
	
	
	String getPath(PathEnum pathSelector);
}
