package com.example.gestordegastos.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.gestordegastos.database.dao.DaoAccount;
import com.example.gestordegastos.database.dao.DaoAccountType;
import com.example.gestordegastos.database.dao.DaoCategoryType;
import com.example.gestordegastos.database.dao.DaoTransaction;
import com.example.gestordegastos.database.dao.DaoTransactionType;
import com.example.gestordegastos.database.entities.Account;
import com.example.gestordegastos.database.entities.AccountType;
import com.example.gestordegastos.database.entities.CategoryType;
import com.example.gestordegastos.database.entities.Transaction;
import com.example.gestordegastos.database.entities.TransactionType;



@Database(version = 1, entities = {Account.class, AccountType.class, Transaction.class, TransactionType.class, CategoryType.class})
public abstract class DatabaseDAOs extends RoomDatabase {
    public abstract DaoAccountType daoAccountType();
    public abstract DaoAccount daoAccount();
    public abstract DaoTransaction daoTransaction();
    public abstract DaoCategoryType daoCategoryType();
    public abstract DaoTransactionType daoTransactionType();

}
