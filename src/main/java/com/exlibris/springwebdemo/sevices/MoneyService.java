package com.exlibris.springwebdemo.sevices;

/**
 * @author Evgeny Borisov
 */
public interface MoneyService {
    void fillBankWithMoney();

    long loan(String name, long amount);
}
