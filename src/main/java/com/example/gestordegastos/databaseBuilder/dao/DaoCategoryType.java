package com.example.gestordegastos.databaseBuilder.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.gestordegastos.databaseBuilder.entities.CategoryType;

import java.util.List;

@Dao
public interface DaoCategoryType {
    @Insert
    void insertCategoryType(CategoryType categoryType);

    @Query("SELECT * FROM `CategoryType`")
    List<CategoryType> getAllCategoryTypes();
}
