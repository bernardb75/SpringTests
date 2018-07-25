package com.caveofprogramming.spring.test.test;

//import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Logger {

	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;
	
	@Inject
	@Named(value="consoleWriter")
	//@Resource
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Inject
	@Named(value="squirrel")
	//@Resource(name = "squirrel")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsole(String text) {
		if (consoleWriter != null)
			consoleWriter.write(text);
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
