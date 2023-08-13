package com.project.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.StockPrices;
import com.project.services.StockPricesServicesJPA;

@RestController
public class StockPricesController {

	@Autowired
	StockPricesServicesJPA sp;
	
	@RequestMapping(method=RequestMethod.GET, value="/getPrices")
	public ArrayList<StockPrices> getPrices(){
		return sp.getPrices();
	}
}
