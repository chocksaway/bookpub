package com.chocksaway.controllers;

import com.chocksaway.entity.Account;
import com.chocksaway.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by milesd on 26/03/2016.
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @RequestMapping(value = "/{name}", method =
            RequestMethod.GET)
    public Account getAccount(@PathVariable String name) {
        return accountRepository.findAccountByName(name);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String postBook(@RequestBody Account account) {
        // return account.findAccountByName(account.getName(), account.getPassword());
        return "Hello";
    }

}