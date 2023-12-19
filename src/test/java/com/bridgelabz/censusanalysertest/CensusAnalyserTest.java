package com.bridgelabz.censusanalysertest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.censusanalyser.CSVStateCensus;
import com.bridgelabz.censusanalyser.StateCensusPojo;
import com.bridgelabz.errorandexceptions.CensusAnalyserException;

public class CensusAnalyserTest {

	CSVStateCensus csvStateCensus;
	String filePath;

	@BeforeEach
	void setUp() throws Exception {
		csvStateCensus = new CSVStateCensus();
		filePath = "C:\\Users\\KIIT\\Downloads\\StateCensus.csv";
	}

	@Test
	void test() {
		try {
			List<StateCensusPojo> censusDataList = csvStateCensus.loadCSVData(filePath);
			int expectedRecordCount = 37;

			assertEquals(expectedRecordCount, censusDataList.size(), "Number of records does not match.");
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
		}
	}

}
