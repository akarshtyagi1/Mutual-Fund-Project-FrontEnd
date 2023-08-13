package com.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Company;
import com.project.services.CompanyServiceJPA;

@RestController
public class CompanyController {
	
	@Autowired
	CompanyServiceJPA csjpa;
	
	@RequestMapping(value="/companies", method=RequestMethod.GET)
	public ArrayList<Company> getCompanies() {
		return csjpa.getAllCompanies();
	}

}
