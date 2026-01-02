package com.tcs.netbanking.Controller;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.netbanking.bean.Account;
import com.tcs.netbanking.service.Accountservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	@Autowired
    Accountservice service;

   

    @PostMapping("/saveacc")
    public ResponseEntity<Account> create(@Valid @RequestBody Account account) {
        return ResponseEntity.ok(service.create(account));
    }

    

    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/branch/{branchId}")
    public ResponseEntity<List<Account>> getByBranchId(@PathVariable String branchId) {
        return ResponseEntity.ok(service.getByBranchId(branchId));
    }

  
}
