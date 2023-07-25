package com.example.gestordegastos.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.database.DatabaseBuilder;
import com.example.gestordegastos.database.entities.AccountType;
import com.example.gestordegastos.database.entities.CategoryType;
import com.example.gestordegastos.database.entities.TransactionType;

public class PreloadView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!DatabaseBuilder.tablesExits(getApplicationContext())) {
            loadAccountTypes(getApplicationContext());
            loadCategoryTypes(getApplicationContext());
            loadTransactionTypes(getApplicationContext());

            Log.i("TOAST","ACA PASO TODO BIEN");
        } else {
            Log.e("TOAST","HUBO UN ERROR");
        }

        Intent startIntent = new Intent(this, StartView.class);
        startActivity(startIntent);

        finish();
    }

    private void loadAccountTypes(Context ctx) {
        DatabaseBuilder.getBD(ctx).daoAccountType().insertAccountType(new AccountType(1,"DEBITO"));
        DatabaseBuilder.getBD(ctx).daoAccountType().insertAccountType(new AccountType(2,"CREDITO"));
    }

    private void loadCategoryTypes(Context ctx) {
        DatabaseBuilder.getBD(ctx).daoCategoryType().insertCategoryType(new CategoryType(1,"CENA"));
        DatabaseBuilder.getBD(ctx).daoCategoryType().insertCategoryType(new CategoryType(2,"SUELDO"));
        DatabaseBuilder.getBD(ctx).daoCategoryType().insertCategoryType(new CategoryType(3,"CUOTA"));
    }

    private void loadTransactionTypes(Context ctx) {
        DatabaseBuilder.getBD(ctx).daoTransactionType().insertTransactionType(new TransactionType(1,"DEBITO"));
        DatabaseBuilder.getBD(ctx).daoTransactionType().insertTransactionType(new TransactionType(2,"CREDITO"));
        DatabaseBuilder.getBD(ctx).daoTransactionType().insertTransactionType(new TransactionType(3,"INGRESO"));
    }
}
