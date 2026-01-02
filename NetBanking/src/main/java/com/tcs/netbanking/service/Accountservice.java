package com.tcs.netbanking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.netbanking.bean.Account;
import com.tcs.netbanking.repository.AccountRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Accountservice {
	@Autowired
    AccountRepository repo;

   

    public Account create(Account account) {
        return repo.save(account);
    }

   
    public List<Account> getByBranchId(String branchId) {
        return repo.findByBranchId(branchId);
    }

    public List<Account> getAll() {
        return repo.findAll();
    }

   
}
