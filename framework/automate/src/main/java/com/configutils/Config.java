package com.configutils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
	public static String  get(String keyname) {
		FileReader file=null;
	try {
		 file=new FileReader("C:\\framework\\automate\\src\\main\\java\\com\\configutils\\Config.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties P= new Properties();
	try {
		P.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String kvalue=(String) P.get(keyname);
	return kvalue;

	}
	}
