package com.codingbat;

import java.io.FileInputStream;
import java.io.InputStream;

public class loadTextFile {

	public static void main(String[] args) {

		try {
			// file input.txt is loaded as input stream
			// input.txt file contains
			// this is content
			InputStream input = new FileInputStream("input.txt");
			System.out.println("Data in the file: ");

			// reads the first byte
			int i = input.read();
			while (i != -1) {
				System.out.println((char) i);
				// reads next byte from the file
				i = input.read();

			}
			input.close();

		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
