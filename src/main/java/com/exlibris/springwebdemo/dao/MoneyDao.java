package com.exlibris.springwebdemo.dao;

import com.exlibris.springwebdemo.model.Bank;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface MoneyDao extends CrudRepository<Bank,Integer> {
    List<Bank> findPleaseByAmountGreaterThan(int amount);
}
