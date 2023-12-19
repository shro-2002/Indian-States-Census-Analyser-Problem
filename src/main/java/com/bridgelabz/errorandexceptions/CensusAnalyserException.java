package com.bridgelabz.errorandexceptions;

public class CensusAnalyserException extends Exception {
	private static final long serialVersionUID = 1L;

	private final CensusAnalyserError errorType;

	public CensusAnalyserException(String message, CensusAnalyserError errorType) {
		super(message);
		this.errorType = errorType;
	}

	public CensusAnalyserError getErrorType() {
		return errorType;
	}
}
