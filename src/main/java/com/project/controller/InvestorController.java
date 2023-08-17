package com.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Investor;
import com.project.model.LoginForm;
import com.project.services.InvestorServiceJPA;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class InvestorController {
	
	@Autowired
	InvestorServiceJPA Is;
	
	@RequestMapping(value="/investor", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Investor> getAllInvestors(){
		return Is.getAllInvestors();
	}
	
	@RequestMapping(value="/investor", method=RequestMethod.POST)
	public String investorRegister(@RequestBody Investor newInvestor) {
		return Is.investorRegister(newInvestor);
	}
	
	@RequestMapping(value="/investor/login", method=RequestMethod.POST)
	public String investorLogin(@RequestBody LoginForm loginData) {
		return Is.investorLogin(loginData);
	}
	
	@RequestMapping(value="/investor", method=RequestMethod.DELETE)
	public String investorDel(@RequestBody LoginForm delData) {
		return Is.investorDel(delData);
	}
	
	@RequestMapping(value="/investor/{id}", method=RequestMethod.DELETE)
	public String investorDel(@PathVariable("id") int delId) {
		return Is.investorDelById(delId);
	}
	
	@RequestMapping(value="/investor", method=RequestMethod.PUT)
	public String investorUpdate(@RequestBody Investor newInvestor) {
		return Is.investorUpdate(newInvestor);
	}
	
	@RequestMapping(value="/investor/{id}", method=RequestMethod.PUT)
	public String investorUpdate(@PathVariable("id") int updateId,@RequestBody Investor newInvestor) {
		return Is.investorUpdateId(updateId, newInvestor);
	}

}
