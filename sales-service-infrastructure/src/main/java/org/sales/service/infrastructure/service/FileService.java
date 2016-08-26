package org.sales.service.infrastructure.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class FileService {

	public String[] readDirectory(String pathFile) {
		try {
			return new File(pathFile).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void writeInFile(List<String> texts, String pathFile) {
		try {
			FileOutputStream outputStream = new FileOutputStream(pathFile);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

			for (String textLine : texts) {
				bufferedWriter.write(textLine);
				bufferedWriter.newLine();
			}

			bufferedWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
