package com.nttdata.banca.account.model.repository;

import com.nttdata.banca.account.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
  List<Account> findByNumber(String number);
  List<Account> findByAmountGreaterThanEqual(Float amount);
}
