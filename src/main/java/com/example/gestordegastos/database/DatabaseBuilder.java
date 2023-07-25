package com.example.gestordegastos.database;

import android.content.Context;

import androidx.room.Query;
import androidx.room.Room;

public class DatabaseBuilder {

    public static DatabaseDAOs getBD(Context ctx) {
        DatabaseDAOs myDatabase = Room.databaseBuilder(ctx,
                        DatabaseDAOs.class, "databaseTest")
                .allowMainThreadQueries() // ¡CUIDADO! Esto permite operaciones de base de datos en el hilo principal, lo cual no es recomendado para aplicaciones reales.
                .build();

        return myDatabase;
    }

    public static boolean tablesExits(Context ctx) {
        return getBD(ctx).daoCategoryType().isCreated()
                && getBD(ctx).daoAccountType().isCreated()
                && getBD(ctx).daoTransactionType().isCreated();
    }





}
