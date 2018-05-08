//package com.exlibris.springwebdemo.dao;
//
//import com.exlibris.springwebdemo.model.Bank;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
///**
// * @author Evgeny Borisov
// */
//@Repository
//public class MoneyDaoImpl  {
//    @PersistenceContext
//    private EntityManager em;
//    public void save(Bank bank) {
//        em.persist(bank);
////        List<Bank> banks = em.createQuery("from Bank").getResultList();
//        bank.setAmount(100);
//    }
//}
