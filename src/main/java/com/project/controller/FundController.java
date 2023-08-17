package com.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Funds;
import com.project.services.FundServiceJPA;

@RestController
public class FundController {

	@Autowired
	FundServiceJPA Fs;
	
	@RequestMapping(value="/fund", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Funds> getAllFunds(){
		return Fs.getAllFunds();
	}
	
	@RequestMapping(value="/fund", method=RequestMethod.POST)
	public String addFund(@RequestBody Funds newFund) {
		return Fs.addFund(newFund);
	}
	
	//Delete to be implemented later
	
	@RequestMapping(value="/fund/{id}", method=RequestMethod.PUT)
	public String updateFund(@PathVariable("id") int updateId,@RequestBody Funds updateFund) {
		return Fs.updateFund(updateId, updateFund);
	}
	
}
