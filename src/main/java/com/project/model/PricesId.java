package com.project.model;

import java.io.Serializable;
import java.util.Date;

public class PricesId implements Serializable{

	private Date timeStamp;
	private int companyId;
	
	public PricesId() {
	}
	
	public PricesId(Date timeStamp, int companyId) {
		super();
		this.timeStamp = timeStamp;
		this.companyId = companyId;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	

}
