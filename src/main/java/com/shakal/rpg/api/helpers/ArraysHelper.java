package com.shakal.rpg.api.helpers;

import java.util.Arrays;

public class ArraysHelper {

	public static String intArrayToString(int[] inputArray) {
		return Arrays.toString(inputArray).replaceAll("[\\[\\]]", "");
	    
	}
	//teste
	public static String intArrayToString(Integer[] inputArray) {
		return Arrays.toString(inputArray).replaceAll("[\\[\\]]", "");
	    
	}
	
}
