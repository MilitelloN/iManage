package com.example.gestordegastos.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.database.entities.AccountType;

import java.util.List;


@Dao
public interface DaoAccountType {
    @Insert
    void insertAccountType(AccountType accountType);

    @Query("SELECT * FROM `AccountType`")
    List<AccountType> getAllAccountTypes();

    @Query("SELECT `id` FROM `AccountType` WHERE `id`=:accType")
    int getIdAccountType(int accType);

    @Query("SELECT EXISTS(SELECT * FROM `AccountType`)")
    boolean isCreated();
}
