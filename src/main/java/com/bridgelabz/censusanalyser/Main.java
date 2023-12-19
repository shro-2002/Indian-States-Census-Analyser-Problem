package com.bridgelabz.censusanalyser;

import com.bridgelabz.errorandexceptions.CensusAnalyserException;

public class Main {

	public static void main(String[] args) throws CensusAnalyserException {
		System.out.println("Welcome to the Indian States Census Analyser Problem!");

		StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();

		String filePath = "C:\\Users\\KIIT\\Downloads\\StateCensus.csv";

		censusAnalyser.loadCensusData(filePath);

		CSVStateCensus csvStateCensus = new CSVStateCensus();
		for (StateCensusPojo censusData : csvStateCensus.loadCSVData(filePath)) {
			System.out.println(censusData);
		}
	}

}
