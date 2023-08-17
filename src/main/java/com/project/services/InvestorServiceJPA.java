package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.InvestorRepository;
import com.project.model.Investor;
import com.project.model.LoginForm;

@Service
public class InvestorServiceJPA {
	
	@Autowired
	InvestorRepository Ir;
		
	public ArrayList<Investor> getAllInvestors(){
		ArrayList<Investor> allInvestors=new ArrayList();
		Ir.findAll().forEach(inv->allInvestors.add(inv));
		return allInvestors;
	}
	
	public String investorRegister(Investor Inv) {
		
		
		if(!(Ir.findByEmail(Inv.getEmail())!=null)) {
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
		
		if(Ir.findByEmailAndPassword(loginData.getEmail(), loginData.getPassword())!=null) {
			return "User Id: "+Ir.findInvestorId(loginData.getEmail())+" Logged In";
		}
		
		return "Incorrect username or passowrd";
		
	}
	
	public String investorDel(LoginForm delData) {
		
		Integer delId=Ir.findInvestorId(delData.getEmail());
		try {
			Ir.delete(delId);
			return "Deleted User with ID: "+delId;
		}catch(Exception e) {
			return e.getMessage();
		}
		
	}
	
	public String investorDelById(int delId) {
		try {
			Ir.delete(delId);
			return "Deleted";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
	
	public String investorUpdate(Investor Inv) {

		Integer updateId=Ir.findInvestorId(Inv.getEmail());
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
	
	public String investorUpdateId(int updateId,Investor Inv) {
		
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
