package com.shakal.rpg.api.helpers;

import java.io.File;
import java.io.IOException;

import com.shakal.rpg.api.exception.FileManagementException;
import com.shakal.rpg.api.filedata.service.ExternalCreatureProfileImageService;
import com.shakal.rpg.api.model.Dice;

public class CharacterHelper {

	public static int calculateLifePoints(Dice lifeDice) {
		int result = 0;
		if(lifeDice.getId() == 1) {
			result = 4;
		}
		if(lifeDice.getId() == 2) {
			result = 6;
		}
		if(lifeDice.getId() == 3) {
			result = 8;
		}
		if(lifeDice.getId() == 4) {
			result = 10;
		}
		if(lifeDice.getId() == 5) {
			result = 12;
		}
		if(lifeDice.getId() == 6) {
			result = 20;
		}
		return result;
		
	}
	
	public static String saveCharacterProfilePicture(long id,String base64Image,ExternalCreatureProfileImageService service) throws FileManagementException {
		String fileName = "creature" + id + ".jpg";
		String fileIdentifier = null;
		try {
			File fileToUp = FileHelper.base64ToFile(base64Image);
			fileIdentifier = service.saveMapImageFile(fileToUp, fileName);
			return fileIdentifier;
		} catch (IOException e) {
			throw new FileManagementException("Erro ao salvar o arquivo");
		}
	}
}
