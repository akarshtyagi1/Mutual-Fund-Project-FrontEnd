package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.InvestorDAO;
import com.project.interfaces.InvestorRepository;
import com.project.model.Investor;
import com.project.model.LoginForm;

@Service
public class InvestorServiceJPA {
	
	@Autowired
	InvestorRepository Ir;
	
	@Autowired
	InvestorDAO dao;
		
	public ArrayList<Investor> getAllInvestors(){
		ArrayList<Investor> allInvestors=new ArrayList();
		Ir.findAll().forEach(inv->allInvestors.add(inv));
		return allInvestors;
	}
	
	public String investorRegister(Investor Inv) {
		
		
		if(dao.checkEmail(Inv.getEmail())) {
			try {
				Ir.save(Inv);
				return "registered";
			}catch(Exception e) {
				System.out.println(e.getMessage());
				return e.getMessage();
			}
		}
		
		
		return "User With this email already exists";
	}
	
	public String investorLogin(LoginForm loginData) {
		
		if(dao.checkUser(loginData.getEmail(), loginData.getPassword())) {
			return "User Id: "+dao.getInvestorId(loginData.getEmail())+" Logged In";
		}
		
		return "Incorrect username or passowrd";
		
	}
	
	public String investorDel(LoginForm delData) {
		
		Integer delId=dao.getInvestorId(delData.getEmail());
		try {
			Ir.delete(delId);
			return "Deleted User with ID: "+delId;
		}catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
	public String investorUpdate(Investor Inv) {
		Integer updateId=dao.getInvestorId(Inv.getEmail());
		Investor updateInv=Ir.findOne(updateId);
		
		if(Inv.getPassword()!=null) {
			updateInv.setPassword(Inv.getPassword());
		}
		
		if(Inv.getInvestment()!=0l) {
			updateInv.setInvestment(Inv.getInvestment());
		}
		
		if(Inv.getPhone()!=null) {
			updateInv.setPhone(Inv.getPhone());
		}
		
		try {
			Ir.save(updateInv);
			return "Updated";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	

}
