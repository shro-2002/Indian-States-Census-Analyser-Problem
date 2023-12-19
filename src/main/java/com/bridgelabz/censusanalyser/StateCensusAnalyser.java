package com.bridgelabz.censusanalyser;

import java.util.List;

import com.bridgelabz.errorandexceptions.CensusAnalyserException;

public class StateCensusAnalyser {
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
