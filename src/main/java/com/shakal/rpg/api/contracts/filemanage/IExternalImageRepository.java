package com.shakal.rpg.api.contracts.filemanage;

import java.io.File;

public interface IExternalImageRepository {

	File retrieveFileByName(String fileName);
}
