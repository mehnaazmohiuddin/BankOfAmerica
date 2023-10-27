package com.bankofamerica.db;

import com.mehnaaz.sdk.bank.dao.BankDB;

import java.util.HashMap;

public class BankOfAmericaDB implements BankDB {

    HashMap<Integer, Integer> accounts;
    private static  BankOfAmericaDB instance ;

    private BankOfAmericaDB (){
        accounts = new HashMap<>();
        accounts.put(1,1000);
        accounts.put(2,2000);
        accounts.put(3,3000);
        accounts.put(4,4000);

    }

    public synchronized static BankOfAmericaDB getInstance(){
        System.out.println("Coming here ");
        if(instance == null){
            instance= new BankOfAmericaDB();
            return  instance;
        }else
            return  instance;
    }
    @Override
    public boolean setBalance(int i, String s) {
        accounts.put(Integer.parseInt(s),i);
        return true;
    }

    @Override
    public int getBalance(String s) {
        return accounts.get(Integer.parseInt(s));
    }
}
