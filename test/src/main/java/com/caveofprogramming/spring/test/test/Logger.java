package com.caveofprogramming.spring.test.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
	
private ConsoleWriter consoleWriter;
	
private LogWriter fileWriter;


/*
@Autowired
public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
	this.consoleWriter=consoleWriter;
	this.fileWriter=fileWriter;
}
*/

@Autowired(required=false)
@Qualifier("toconsole")
public void setConsoleWriter(ConsoleWriter consoleWriter) {
	this.consoleWriter = consoleWriter;
}
@Autowired
@Qualifier("filewriter")
public void setFileWriter(LogWriter fileWriter) {
	this.fileWriter = fileWriter;
}
public void writeFile(String text) {
	fileWriter.write(text);
}
public void writeConsole(String text) {
	if(consoleWriter!=null)
		consoleWriter.write(text);
}

}
