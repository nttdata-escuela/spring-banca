package com.nttdata.banca.customer.model.repository;

import com.nttdata.banca.customer.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer > {
  List<Customer> findByAgeGreaterThan(Integer age);

}
