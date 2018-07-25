package com.caveofprogramming.spring.test.test;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("filewriter")
public class FileWriter implements LogWriter {

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("Zapisz do pliku: "+text);
	}

}
