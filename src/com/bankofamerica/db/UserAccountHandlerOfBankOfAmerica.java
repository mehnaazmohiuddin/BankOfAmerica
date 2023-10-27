package com.bankofamerica.db;
import com.mehnaaz.sdk.bank.dao.BankDB;
import com.mehnaaz.sdk.bank.handlers.UserAccountHandler;

public class UserAccountHandlerOfBankOfAmerica extends UserAccountHandler{

    public UserAccountHandlerOfBankOfAmerica(BankDB db) {
        super(db);
    }

    public  void setBankDB(){
        com.mehnaaz.sdk.bank.dao.BankDB bankDB = BankOfAmericaDB.getInstance();
    }


}
