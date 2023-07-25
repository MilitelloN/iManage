package com.example.gestordegastos.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.database.entities.CategoryType;

import java.util.List;

@Dao
public interface DaoCategoryType {
    @Insert
    void insertCategoryType(CategoryType categoryType);

    @Query("SELECT * FROM `CategoryType`")
    List<CategoryType> getAllCategoryTypes();

    @Query("SELECT EXISTS(SELECT * FROM `CategoryType`)")
    boolean isCreated();
}
