package com.bridgelabz.errorandexceptions;

public enum CensusAnalyserError {
	FILE_NOT_FOUND("File not found"), 
	INVALID_FORMAT("Invalid CSV file format"),
	PARSING_ERROR("Error parsing file");

	private final String message;

	CensusAnalyserError(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
