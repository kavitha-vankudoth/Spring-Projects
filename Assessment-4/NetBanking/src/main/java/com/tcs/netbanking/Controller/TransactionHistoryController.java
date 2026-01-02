package com.tcs.netbanking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.netbanking.bean.TransactionHistory;
import com.tcs.netbanking.service.TransactionHistoryservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/transactions")
public class TransactionHistoryController {
	@Autowired
    TransactionHistoryservice service;

  

    @PostMapping("/savetrans")
    public ResponseEntity<String> create(@Valid @RequestBody TransactionHistory tx) {
    	service.create(tx);
        return new ResponseEntity<>("SAved", HttpStatus.OK);
    }

   

    @GetMapping
    public ResponseEntity<List<TransactionHistory>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

   

 
}
