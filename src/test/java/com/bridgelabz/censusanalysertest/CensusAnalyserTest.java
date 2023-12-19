package com.bridgelabz.censusanalysertest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bridgelabz.censusanalyser.CSVStateCensus;
import com.bridgelabz.censusanalyser.StateCensusPojo;
import com.bridgelabz.errorandexceptions.CensusAnalyserError;
import com.bridgelabz.errorandexceptions.CensusAnalyserException;

/*
 * @Description - Test cases for State Census Analyser
 * 
 * @Properties: csvStateCensus, CORRECT_FILE, WRONG_FILE
 * 
 * @Methods: setUp(), checkRecordTest(), customExceptionTest(), testIncorrectFileType()
 */
public class CensusAnalyserTest {

	CSVStateCensus csvStateCensus;
	private static final String CORRECT_FILE = "C:\\Users\\KIIT\\Downloads\\StateCensus.csv";
	private static final String WRONG_FILE = "C:\\Users\\KIIT\\Downloads\\InvalidStateCensus.csv";

	/*
	 * @Description - Method to set up the object before testing
	 */
	@BeforeEach
	void setUp() throws Exception {
		csvStateCensus = new CSVStateCensus();
	}


	/*
	 * @Description - Method to check the number of records in the file
	 * 
	 * @param - None
	 * 
	 * @Assert - Number of records in the file
	 */
	@Test
	void checkRecordTest() {
		
		try {
			List<StateCensusPojo> censusDataList = csvStateCensus.loadCSVData(CORRECT_FILE);

			assertEquals(37, censusDataList.size(), "Number of records does not match.");
		} catch (CensusAnalyserException e) {
			e.printStackTrace();
		}
	}

	/*
	 * @Description - Method to check the custom exception for incorrect file
	 * 
	 * @param - None
	 * 
	 * @Assert -FILE_NOT_CORRECT exception
	 */
	@Test
	void customExceptionTest() {

		CensusAnalyserException exception = assertThrows(CensusAnalyserException.class,
				() -> csvStateCensus.loadCSVData(WRONG_FILE));

		assertEquals(CensusAnalyserError.FILE_NOT_CORRECT, exception.getErrorType(), "Invalid exception type");
	}

	/*
	 * @Description - Method to check the custom exception for incorrect file type
	 * 
	 * @param - None
	 * 
	 * @Assert -FILE_NOT_CORRECT exception
	 */
	@Test
	public void testIncorrectFileType() {
		
		String WRONG_FILE_TYPE = "C:\\Users\\KIIT\\Downloads\\StateCensus.txt";
		try {
			csvStateCensus.loadCSVData(WRONG_FILE_TYPE);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserError.FILE_NOT_CORRECT, e.getErrorType());
		}
	}
}