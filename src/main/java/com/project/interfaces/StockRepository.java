package com.project.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.project.model.PricesId;
import com.project.model.StockPrices;

public interface StockRepository extends CrudRepository<StockPrices, PricesId>{
	
}
