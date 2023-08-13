package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.CompanyRepository;
import com.project.model.Company;

@Service
public class CompanyServiceJPA {
	
	@Autowired
	CompanyRepository cRepo;

	public ArrayList<Company> getAllCompanies() {
		ArrayList<Company> allCompanies = new ArrayList<Company>();
		cRepo.findAll()
		.forEach(company -> allCompanies.add(company));
		return allCompanies;
	}
	
	
}
