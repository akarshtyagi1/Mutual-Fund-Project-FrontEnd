package com.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Company;
import com.project.services.CompanyServiceJPA;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CompanyController {
	
	@Autowired
	CompanyServiceJPA csjpa;
	
	@RequestMapping(value="/companies", method=RequestMethod.GET, produces= {MediaType.APPLICATION_JSON_VALUE})
	@CrossOrigin(origins="http://localhost:3000")
	public ArrayList<Company> getCompanies() {
		return csjpa.getAllCompanies();
	}

}
