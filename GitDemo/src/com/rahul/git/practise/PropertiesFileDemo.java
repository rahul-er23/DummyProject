package com.rahul.git.practise;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("D:\\Study Material\\Java\\db.properties");
		Properties p=new Properties();
		p.load(reader);
		String username=p.getProperty("username");
		System.out.println(username);
		String pass = p.getProperty("pass");
		System.out.println(pass);
		

	}

}
