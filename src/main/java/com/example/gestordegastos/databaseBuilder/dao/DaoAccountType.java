package com.example.gestordegastos.databaseBuilder.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.databaseBuilder.entities.AccountType;

import java.util.List;


@Dao
public interface DaoAccountType {
    @Insert
    void insertAccountType(AccountType accountType);

    @Query("SELECT * FROM `AccountType`")
    List<AccountType> getAllAccountTypes();
}
