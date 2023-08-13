package com.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Weights {
	@Id
	private int weightId;
	private int comapnyId;
	private double weight;
	private int fundId;
	
	public int getWeightId() {
		return weightId;
	}
	public void setWeightId(int weightId) {
		this.weightId = weightId;
	}
	public int getComapnyId() {
		return comapnyId;
	}
	public void setComapnyId(int comapnyId) {
		this.comapnyId = comapnyId;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getFundId() {
		return fundId;
	}
	public void setFundId(int fundId) {
		this.fundId = fundId;
	}
	@Override
	public String toString() {
		return "Weights [weightId=" + weightId + ", comapnyId=" + comapnyId + ", weight=" + weight + ", fundId="
				+ fundId + "]";
	}
}
