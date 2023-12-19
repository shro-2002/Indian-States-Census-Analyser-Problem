package com.bridgelabz.censusanalyser;

import java.util.List;

import com.bridgelabz.errorandexceptions.CensusAnalyserException;

/*
 * @Description - Class to load the State Census Data
 * 
 * @Methods: loadCensusData()
 */
public class StateCensusAnalyser {

	/*
	 * @Description - Method to check the number of records in the file
	 * 
	 * @param - String filePath
	 * 
	 * @return - None
	 */
	public void loadCensusData(String filePath) {
		CSVStateCensus csvStateCensus = new CSVStateCensus();

		try {
			List<StateCensusPojo> censusDataList = csvStateCensus.loadCSVData(filePath);
			System.out.println("Number of records: " + censusDataList.size());
		} catch (CensusAnalyserException e) {
			System.err.println("Exception: " + e.getMessage() + ", Error Type: " + e.getErrorType());
		}
	}
}
