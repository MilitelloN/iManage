package com.example.gestordegastos.databaseBuilder;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.gestordegastos.databaseBuilder.dao.DaoAccount;
import com.example.gestordegastos.databaseBuilder.dao.DaoAccountType;
import com.example.gestordegastos.databaseBuilder.dao.DaoCategoryType;
import com.example.gestordegastos.databaseBuilder.dao.DaoTransaction;
import com.example.gestordegastos.databaseBuilder.dao.DaoTransactionType;
import com.example.gestordegastos.databaseBuilder.entities.Account;
import com.example.gestordegastos.databaseBuilder.entities.AccountType;
import com.example.gestordegastos.databaseBuilder.entities.CategoryType;
import com.example.gestordegastos.databaseBuilder.entities.Transaction;
import com.example.gestordegastos.databaseBuilder.entities.TransactionType;



@Database(version = 1, entities = {Account.class, AccountType.class, Transaction.class, TransactionType.class, CategoryType.class})
public abstract class DatabaseBuilder extends RoomDatabase {
    public abstract DaoAccountType daoAccountTypes();
    public abstract DaoAccount daoAccount();
    public abstract DaoTransaction daoTransaction();
    public abstract DaoCategoryType daoCategoryType();
    public abstract DaoTransactionType daoTransactionType();

}
