// CSVStateCensus.java
package com.bridgelabz.censusanalyser;

import com.bridgelabz.errorandexceptions.CensusAnalyserError;
import com.bridgelabz.errorandexceptions.CensusAnalyserException;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVStateCensus {
	public List<StateCensusPojo> loadCSVData(String filePath) throws CensusAnalyserException {
		List<StateCensusPojo> censusDataList = new ArrayList<>();

		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			Iterator<String[]> iterator = reader.iterator();

			if (iterator.hasNext()) {
				iterator.next();
			}

			while (iterator.hasNext()) {
				String[] data = iterator.next()[0].split(",");
				try {
					int srNo = Integer.parseInt(data[0]);
					String stateName = data[1];
					int tin = Integer.parseInt(data[2]);
					String stateCode = data[3];

					StateCensusPojo census = new StateCensusPojo();
					census.setSrNo(srNo);
					census.setStateName(stateName);
					census.setTin(tin);
					census.setStateCode(stateCode);
					censusDataList.add(census);
				} catch (NumberFormatException e) {
					throw new CensusAnalyserException("Error parsing file: " + e.getMessage(),
							CensusAnalyserError.PARSING_ERROR);
				}
			}
		} catch (IOException e) {
			throw new CensusAnalyserException("Error reading file: " + e.getMessage(),
					CensusAnalyserError.FILE_NOT_FOUND);
		} catch (Exception e) {
			throw new CensusAnalyserException("Error processing CSV data: " + e.getMessage(),
					CensusAnalyserError.INVALID_FORMAT);
		}

		return censusDataList;
	}
}
