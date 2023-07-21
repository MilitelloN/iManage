package com.example.gestordegastos.databaseBuilder.dao;




import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.databaseBuilder.entities.Account;

import java.util.List;

@Dao
public interface DaoAccount {
    @Query("SELECT * FROM `Account`")
    List<Account> getAllAccounts();


//    @Query("SELECT `name` FROM `Account`")
//    List<String> getAccountNames();

    @Insert
    void insertAccount(Account account);

}
