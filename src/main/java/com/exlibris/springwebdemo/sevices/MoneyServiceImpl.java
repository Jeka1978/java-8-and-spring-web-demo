package com.exlibris.springwebdemo.sevices;

import com.exlibris.springwebdemo.dao.MoneyDao;
import com.exlibris.springwebdemo.model.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    private MoneyDao moneyDao;
    @Autowired
    private ProphetService prophetService;


    @Override
    @EventListener(ContextRefreshedEvent.class)
    public void fillBankWithMoney() {
        System.out.println(moneyDao.getClass());
        System.out.println("bank was filled with money");
        moneyDao.save(new Bank(100500));
    }

    @Override
    public long loan(String name, long amount) {

        Bank bank = moneyDao.findAll().iterator().next();
        if (bank.getAmount() > amount && prophetService.willSurvive(name)) {
            bank.setAmount(bank.getAmount()-amount);
            return bank.getAmount();
        }
        else {
            return -1;
        }

    }
}







