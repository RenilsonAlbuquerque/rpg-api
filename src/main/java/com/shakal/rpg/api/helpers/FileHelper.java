package com.shakal.rpg.api.helpers;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import javax.imageio.ImageIO;



//import org.apache.tomcat.util.codec.binary.Base64;

public abstract class FileHelper {
	
	public static Dimension createFileAndPersist(String pathName,String base64File, String fileName) throws IOException {
		
		byte[] decodedImg =
				//Base64.getDecoder().decode(base64File.getBytes("UTF-8"));
				Base64.getMimeDecoder().decode(base64File.split(",")[1]);
				
		Path destinationFile = Paths.get(pathName,fileName);
		Files.write(destinationFile, decodedImg);
		
		return getDimensionsOfImage(new File(pathName+ fileName));
	}
	public static String convertImageToBase64(String filePath) throws IOException {
		File file = new File(filePath);
		return "data:image/jpeg;base64," + Base64
		          .getEncoder()
		          .encodeToString(Files.readAllBytes(file.toPath()));

	}
	public static Dimension getDimensionsOfImage(File file) {
		BufferedImage readImage = null;
		int w = 0, h = 0;
		try {
		    readImage = ImageIO.read(file);
		    h = readImage.getHeight();
		    w = readImage.getWidth();
		} catch (Exception e) {
		    readImage = null;
		}
		return new Dimension(w,h);
	}
	public static String convertImageToBase64Mini(String filePath)  {
		
		BufferedImage img;
		BufferedImage scaledImage;
		byte[] imageBytes;
		String result = "";
		try {
			img = ImageIO.read(new File(filePath));
		
			scaledImage = resiezeImage(img,img.getWidth()/10, img.getHeight()/10);
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		
		ImageIO.write(scaledImage, "jpeg", os);
		imageBytes = os.toByteArray();
        
		result = "data:image/jpeg;base64," + Base64
		          .getEncoder()
		          .encodeToString(imageBytes);
		} catch (IOException e) {
			result = "";
		}
		return result;
	}
	private static BufferedImage resiezeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
		BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2D = resizedImage.createGraphics();
		graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
		graphics2D.dispose();
		return resizedImage;
	}
}
