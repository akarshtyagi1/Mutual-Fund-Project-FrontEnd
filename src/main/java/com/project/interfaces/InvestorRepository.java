package com.project.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Investor;

public interface InvestorRepository extends CrudRepository<Investor, Integer>{

}
