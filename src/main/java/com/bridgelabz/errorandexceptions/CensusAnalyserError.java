package com.bridgelabz.errorandexceptions;

/*
 * @Description - Enum for custom errors in Census Analyser
 * 
 * @Constants: FILE_NOT_CORRECT, INVALID_FORMAT, PARSING_ERROR
 * 
 * @Methods: CensusAnalyserException(), getMessage()
 */
public enum CensusAnalyserError {
	FILE_NOT_CORRECT("Error reading CSV file"), 
	INVALID_FORMAT("Invalid number of columns in CSV"),
	PARSING_ERROR("Error parsing numeric values in CSV");

	private final String message;

	/*
	 * @Description - Constructor for CensusAnalyserException
	 * 
	 * @param - String message
	 * 
	 * @return - None
	 */
	CensusAnalyserError(String message) {
		this.message = message;
	}

	/*
	 * @Description - Method to get the message
	 * 
	 * @param - None
	 * 
	 * @return - String message
	 */
	public String getMessage() {
		return message;
	}
}
