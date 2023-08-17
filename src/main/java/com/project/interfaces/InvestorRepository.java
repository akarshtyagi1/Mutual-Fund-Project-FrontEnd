package com.project.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.project.model.Investor;

public interface InvestorRepository extends CrudRepository<Investor, Integer>{
	
	Investor findByEmailAndPassword(String email,String password);
	
	Investor findByEmail(String email);
	
	@Query(value="SELECT i.INVESTOR_ID FROM INVESTORS i WHERE i.EMAIL= :email", nativeQuery = true)
	Integer findInvestorId(@Param("email") String email);

}
