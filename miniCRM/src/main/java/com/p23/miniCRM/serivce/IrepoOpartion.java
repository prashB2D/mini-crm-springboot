package com.p23.miniCRM.serivce;

import java.util.List;

import com.p23.miniCRM.model.Customer;

public interface IrepoOpartion {

	
	public List<Customer> getCFullinfo();
	public Customer CgetById(Integer ID);
	public void Cdelte(Integer ID);
	public void Cadd(Customer costmerinfo);
	
}
