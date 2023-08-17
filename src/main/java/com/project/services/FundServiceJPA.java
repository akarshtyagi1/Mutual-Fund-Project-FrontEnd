package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.FundsRepository;
import com.project.model.Funds;

@Service
public class FundServiceJPA {

	@Autowired
	FundsRepository Fr;
	
	public ArrayList<Funds> getAllFunds(){
		ArrayList<Funds> allFunds=new ArrayList();
		Fr.findAll().forEach(fund->allFunds.add(fund));
		return allFunds;
	}
	
	public String addFund(Funds newFund) {
		try {
			Fr.save(newFund);
			return "Fund Added";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String updateFund(int id,Funds updateFund) {
		Funds fund=Fr.findOne(id);
		
		if(updateFund.getAssets()!=0) {
			fund.setAssets(updateFund.getAssets());
		}
		if(updateFund.getBalance()!=0) {
			fund.setBalance(updateFund.getBalance());
		}
		if(updateFund.getNav()!=0) {
			fund.setNav(updateFund.getNav());
		}
		if(updateFund.getExpenseRatio()!=0) {
			fund.setExpenseRatio(updateFund.getExpenseRatio());
		}
		if(updateFund.getExitLoad()!=0) {
			fund.setExitLoad(updateFund.getExitLoad());
		}
		
		try {
			Fr.save(fund);
			return "Fund Updated";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
}
