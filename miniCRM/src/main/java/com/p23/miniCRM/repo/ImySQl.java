package com.p23.miniCRM.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.p23.miniCRM.model.Customer;
@Repository
public interface ImySQl extends CrudRepository<Customer, Integer> {

}
