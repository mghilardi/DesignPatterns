package org.pattern.behavioral.chainofresponsibility;

import org.pattern.behavioral.chainofresponsibility.log.AbstractLogger;
import org.pattern.behavioral.chainofresponsibility.log.ConsoleLogger;
import org.pattern.behavioral.chainofresponsibility.log.ErrorLogger;
import org.pattern.behavioral.chainofresponsibility.log.FileLogger;

public class ChainPatternDemo {

	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}