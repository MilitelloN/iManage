package com.example.gestordegastos.model;

import android.util.Log;

import com.example.gestordegastos.presenter.AddAccountPresenter;

public class AddAccountModel {

    private final AddAccountPresenter presenter;

    public AddAccountModel(AddAccountPresenter addAccountPresenter) {
        this.presenter = addAccountPresenter;
    }

    public void saveAccountInSQL() {
        Log.i("TOAST","I should be saving the new account in the database...");
        presenter.onAccountSaved();
    }
}
