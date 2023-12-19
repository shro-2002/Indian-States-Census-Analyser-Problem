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

/*
 * @Description - Class to load the State Census Data
 * 
 * @Methods: loadCSVData()
 * 
 * @Exception: CensusAnalyserException
 * 
 * @Properties: censusDataList
 */
public class CSVStateCensus {
    List<StateCensusPojo> censusDataList = new ArrayList<>();

    /*
        * @Description - Method to check the number of records in the file
        * 
        * @param - String filePath
        * 
        * @return - List<StateCensusPojo> censusDataList
        * 
        * @Exception - FILE_NOT_CORRECT, PARSING_ERROR, INVALID_FORMAT
        */
	public List<StateCensusPojo> loadCSVData(String filePath) throws CensusAnalyserException {
		
		try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
			Iterator<String[]> iterator = reader.iterator();

            // Skip the first line
			
			if (iterator.hasNext()) {
				iterator.next();
			}

			while (iterator.hasNext()) {
				String[] data = iterator.next()[0].split(",");// Split the data by comma
				
				if (data.length != 4) {
					throw new CensusAnalyserException(CensusAnalyserError.INVALID_FORMAT);
				}// Check if the number of columns is 4
				
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
				} 
				
				catch (NumberFormatException e) {
					throw new CensusAnalyserException(CensusAnalyserError.PARSING_ERROR);
				}
			}
		} 
		
		catch (IOException e) {
			throw new CensusAnalyserException(CensusAnalyserError.FILE_NOT_CORRECT);
		}

		return censusDataList;
	}
}
