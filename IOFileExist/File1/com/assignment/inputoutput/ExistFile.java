package com.assignment.inputoutput;

import java.io.File;
import java.util.Scanner;

//class to check file exist or not in a given directory
public class ExistFile {
	public static void main(String args[]) {

		String filePathString;
		Scanner get = new Scanner(System.in);

		System.out.println("Enter file path");
		filePathString = get.next();// taking file path from user

		File file = new File(filePathString); // passing path to file

		if (file.exists() && !file.isDirectory()) {// check if file is present or not
			System.out.println("File is there");
		} else {
			System.out.println("File is not there");
		}
	}

}
