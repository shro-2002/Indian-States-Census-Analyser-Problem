package com.bridgelabz.errorandexceptions;

/*
 * @Description - Custom exception for Census Analyser
 * 
 * @Exception: CensusAnalyserException
 * 
 * @Properties: errorType
 * 
 * @Methods: CensusAnalyserException(), getErrorType()
 */
public class CensusAnalyserException extends Exception {
	private static final long serialVersionUID = 1L;

	private final CensusAnalyserError errorType;

	public CensusAnalyserException(CensusAnalyserError errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}

	public CensusAnalyserError getErrorType() {
		return errorType;
	}
}
