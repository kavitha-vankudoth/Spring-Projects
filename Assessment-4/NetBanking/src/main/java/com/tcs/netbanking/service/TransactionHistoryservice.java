package com.tcs.netbanking.service;

import java.util.List;

import org.hibernate.ResourceClosedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.netbanking.bean.Account;
import com.tcs.netbanking.bean.TransactionHistory;
import com.tcs.netbanking.repository.AccountRepository;
import com.tcs.netbanking.repository.TransactionHistoryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TransactionHistoryservice {

	@Autowired
	TransactionHistoryRepository tr;

   
    public void create(TransactionHistory tx) {
        
        tr.save(tx);
    }

 
 

    public List<TransactionHistory> getAll() {
        return tr.findAll();
    }

   
}
