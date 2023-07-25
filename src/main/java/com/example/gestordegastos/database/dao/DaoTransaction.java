package com.example.gestordegastos.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.database.entities.Transaction;

import java.util.List;

@Dao
public interface DaoTransaction {

//    @Query("SELECT `amount` FROM `transaction` WHERE idAccount= :idAcc")
//    List<Integer> getExpensesFrom(int idAcc);
    @Query("SELECT * FROM `Transaction`")
    List<Transaction> getAllTransactions();

    @Insert
    void insertTransaction(Transaction transaction);
}
