package com.shakal.rpg.api.mappers;

import com.google.gson.Gson;

public abstract class JSONMapper {

	public static String serializeObjectToJSON(Object obj) {
		return new Gson().toJson(obj);
	}
}
