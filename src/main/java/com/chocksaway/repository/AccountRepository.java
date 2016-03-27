package com.chocksaway.repository;

import com.chocksaway.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by milesd on 26/03/2016.
 */

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findAccountByName(String name);
}

