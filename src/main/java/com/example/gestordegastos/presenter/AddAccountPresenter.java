package com.example.gestordegastos.presenter;

import android.content.Context;
import android.text.Editable;

import com.example.gestordegastos.model.AddAccountModel;
import com.example.gestordegastos.view.AddAccountView;

public class AddAccountPresenter {
    private final AddAccountView view;
    private final AddAccountModel model;

    public AddAccountPresenter(AddAccountView addAccountView) {
        this.view = addAccountView;
        this.model = new AddAccountModel(this);
    }

    public void saveNewAccount(Context ctx, String accountName, String accountDesc, boolean accountType, String prevDate, String currDate, String nextDate) {
        model.saveAccountInSQL(ctx, accountName, accountDesc, accountType, prevDate, currDate, nextDate);
    }

    public void onAccountSaved() {
        view.setSummaryView();
    }
}
