package com.example.gestordegastos.model;

import android.content.Context;
import android.text.Editable;
import android.util.Log;

import com.example.gestordegastos.database.DatabaseBuilder;
import com.example.gestordegastos.database.DatabaseDAOs;
import com.example.gestordegastos.database.entities.Account;
import com.example.gestordegastos.presenter.AddAccountPresenter;

public class AddAccountModel {

    private final boolean ACC_DEBIT = false; // 0
    private final boolean ACC_CREDIT = true;

    private final AddAccountPresenter presenter;

    public AddAccountModel(AddAccountPresenter addAccountPresenter) {
        this.presenter = addAccountPresenter;
    }

    public void saveAccountInSQL(Context ctx, String accountName, String accountDesc, boolean accountType, String prevDate, String currDate, String nextDate) {
        DatabaseDAOs database = DatabaseBuilder.getBD(ctx);


        if(database.daoAccount().accountExists(accountName) > 0) {
            Log.i("TOAST","LA CUENTA YA EXISTE");
        } else {

            database.daoAccount().insertAccount(new Account(database.daoAccount().getLastId()+1,
                    accountName,
                    accountDesc,
                    database.daoAccountType().getIdAccountType(accountType == ACC_DEBIT ? 0 : 1),
                    0L,
                    0L,
                    0L));

            Log.i("TOAST","SE GUARDO EN LA BD");
        }

        Log.i("TOAST","FUERA DEL IF");
        presenter.onAccountSaved();
    }
}
