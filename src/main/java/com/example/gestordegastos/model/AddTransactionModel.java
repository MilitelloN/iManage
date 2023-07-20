package com.example.gestordegastos.model;

import android.util.Log;

import com.example.gestordegastos.presenter.AddTransactionPresenter;

public class AddTransactionModel {

    AddTransactionPresenter presenter;

    public AddTransactionModel(AddTransactionPresenter addTransactionPresenter) {
        this.presenter = addTransactionPresenter;
    }

    public void saveTransaction() {
        Log.i("TOAST","Aca deberia guardar la transaccion en SQL");
        presenter.onTransactionSaved();
    }
}
