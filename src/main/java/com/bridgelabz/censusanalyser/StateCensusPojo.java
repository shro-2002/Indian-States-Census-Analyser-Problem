package com.bridgelabz.censusanalyser;

import com.opencsv.bean.CsvBindByName;

public class StateCensusPojo {

	// SrNo,StateName,TIN,StateCode

	@CsvBindByName(column = "SrNo", required = true)
	private int srNo;

	@CsvBindByName(column = "StateName", required = true)
	private String stateName;

	@CsvBindByName(column = "TIN", required = true)
	private int tin;

	@CsvBindByName(column = "StateCode", required = true)
	private String stateCode;

	public StateCensusPojo() {
	}

	public StateCensusPojo(int srNo, String stateName, int tin, String stateCode) {
		this.srNo = srNo;
		this.stateName = stateName;
		this.tin = tin;
		this.stateCode = stateCode;
	}

	public int getSrNo() {
		return srNo;
	}

	public String getStateName() {
		return stateName;
	}

	public int getTin() {
		return tin;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public void setTin(int tin) {
		this.tin = tin;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "StateCensusPojo [srNo=" + srNo + ", stateName=" + stateName + ", tin=" + tin + ", stateCode="
				+ stateCode + "]";
	}

}
