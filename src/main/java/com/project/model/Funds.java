package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funds {
	@Id
	private int fundId;
	private String fundName;
	private double assets, balance, nav, expenseRatio, exitLoad;
	private int managerId ;
	public int getFundId() {
		return fundId;
	}
	public void setFundId(int fundId) {
		this.fundId = fundId;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public double getAssets() {
		return assets;
	}
	public void setAssets(double assets) {
		this.assets = assets;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getNav() {
		return nav;
	}
	public void setNav(double nav) {
		this.nav = nav;
	}
	public double getExpenseRatio() {
		return expenseRatio;
	}
	public void setExpenseRatio(double expenseRatio) {
		this.expenseRatio = expenseRatio;
	}
	public double getExitLoad() {
		return exitLoad;
	}
	public void setExitLoad(double exitLoad) {
		this.exitLoad = exitLoad;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Funds [fundId=" + fundId + ", fundName=" + fundName + ", assets=" + assets + ", balance=" + balance
				+ ", nav=" + nav + ", expenseRatio=" + expenseRatio + ", exitLoad=" + exitLoad + ", managerId="
				+ managerId + "]";
	}
	
}
