package com.example.gestordegastos.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.database.entities.TransactionType;

import java.util.List;

@Dao
public interface DaoTransactionType {
    @Insert
    void insertTransactionType(TransactionType transactionType);

    @Query("SELECT * FROM `TransactionType`")
    List<TransactionType> getAllTransactionTypes();

    @Query("SELECT EXISTS(SELECT * FROM `TransactionType`)")
    boolean isCreated();
}
