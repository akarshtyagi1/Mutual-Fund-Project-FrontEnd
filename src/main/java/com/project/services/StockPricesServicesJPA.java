package com.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.interfaces.StockRepository;
import com.project.model.StockPrices;

@Service
public class StockPricesServicesJPA {
	@Autowired
	StockRepository stockRepo;
	
	public ArrayList<StockPrices> getPrices(){
		ArrayList<StockPrices> stockPrices = new ArrayList<>();
		stockRepo.findAll()
		.forEach( price -> stockPrices.add(price));
		return stockPrices;
	}
}
