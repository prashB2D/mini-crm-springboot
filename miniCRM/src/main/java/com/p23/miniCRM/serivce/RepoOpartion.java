package com.p23.miniCRM.serivce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p23.miniCRM.model.Customer;
import com.p23.miniCRM.repo.ImySQl;
@Service
public class RepoOpartion implements IrepoOpartion {
	
	@Autowired
	private ImySQl repo;

	@Override
	public List<Customer> getCFullinfo() {
		List<Customer> l=(List<Customer>) repo.findAll();
		System.out.println(l);
		return l;
	}

	

	@Override
	public void Cdelte(Integer ID) {
		Optional<Customer> a = repo.findById(ID);
		System.out.println(a.get());
		System.out.println("this is deleted");
		repo.deleteById(ID);

	}

	@Override
	public void Cadd(Customer costmerinfo) {
		repo.save(costmerinfo);

	}


	@Override
	public Customer CgetById(Integer ID) {
		Optional<Customer> a = repo.findById(ID);
		return a.get();
		
	}

}
