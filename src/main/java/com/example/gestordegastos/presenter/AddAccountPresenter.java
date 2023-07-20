package com.example.gestordegastos.presenter;

import com.example.gestordegastos.model.AddAccountModel;
import com.example.gestordegastos.view.AddAccountView;

public class AddAccountPresenter {
    private final AddAccountView view;
    private final AddAccountModel model;

    public AddAccountPresenter(AddAccountView addAccountView) {
        this.view = addAccountView;
        this.model = new AddAccountModel(this);
    }

    public void saveNewAccount() {
        model.saveAccountInSQL();
    }

    public void onAccountSaved() {
        view.setSummaryView();
    }
}
