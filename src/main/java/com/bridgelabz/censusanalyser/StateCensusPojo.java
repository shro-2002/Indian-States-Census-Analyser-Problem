package com.bridgelabz.censusanalyser;

import com.opencsv.bean.CsvBindByName;

/*
 * @Description - Pojo class for State Census
 * 
 * @Properties: srNo, stateName, tin, stateCode
 * 
 * @Methods: toString(), getters and setters
 */
public class StateCensusPojo {


	@CsvBindByName(column = "SrNo", required = true)
	private int srNo;

	@CsvBindByName(column = "StateName", required = true)
	private String stateName;

	@CsvBindByName(column = "TIN", required = true)
	private int tin;

	@CsvBindByName(column = "StateCode", required = true)
	private String stateCode;



    /*
     * @Description - Getter method for SrNo
     * 
     * @param - None
     * 
     * @return - int srNo
     */

	public int getSrNo() {
		return srNo;
	}

    /*
     * @Description - Getter method for StateName
     * 
     * @param - None
     * 
     * @return - String stateName
     */
	public String getStateName() {
		return stateName;
	}

    /*
     * @Description - Getter method for Tin
     * 
     * @param - None
     * 
     * @return - int tin
     */
	public int getTin() {
		return tin;
	}

    /*
     * @Description - Getter method for StateCode
     * 
     * @param - None
     * 
     * @return - String stateCode
     */
	public String getStateCode() {
		return stateCode;
	}

    /*
     * @Description - Setter method for SrNo
     * 
     * @param - int srNo
     * 
     * @return - None
     */
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
/*
     * @Description - Setter method for StateName
     * 
     * @param - String stateName
     * 
     * @return - None
     */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
/*
     * @Description - Setter method for Tin
     * 
     * @param - int tin
     * 
     * @return - None
     */
	public void setTin(int tin) {
		this.tin = tin;
	}
/*
     * @Description - Setter method for StateCode
     * 
     * @param - String stateCode
     * 
     * @return - None
     */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

    /*
     * @Description - Overriding toString method
     * 
     * @param - None
     * 
     * @return - String
     */
	@Override
	public String toString() {
		return "StateCensusPojo [srNo=" + srNo + ", stateName=" + stateName + ", tin=" + tin + ", stateCode="
				+ stateCode + "]";
	}

}
