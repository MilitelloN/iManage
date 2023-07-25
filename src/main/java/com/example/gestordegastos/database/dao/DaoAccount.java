package com.example.gestordegastos.database.dao;




import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.database.entities.Account;

import java.util.List;

@Dao
public interface DaoAccount {
    @Query("SELECT * FROM `Account`")
    List<Account> getAllAccounts();


//    @Query("SELECT `name` FROM `Account`")
//    List<String> getAccountNames();

    @Query("SELECT COUNT(*) FROM `Account` WHERE `name`=:name")
    int accountExists(String name);

    @Insert
    void insertAccount(Account account);

    @Query("SELECT COUNT(*) FROM `Account`")
    int getLastId();
}
