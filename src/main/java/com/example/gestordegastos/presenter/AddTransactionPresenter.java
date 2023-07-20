package com.example.gestordegastos.presenter;

import com.example.gestordegastos.model.AddTransactionModel;
import com.example.gestordegastos.view.AddTransactionView;

public class AddTransactionPresenter {

    AddTransactionView view;
    AddTransactionModel model;

    public AddTransactionPresenter(AddTransactionView view) {
        this.view = view;
        this.model = new AddTransactionModel(this);
    }


    public void saveTransaction() {
        this.model.saveTransaction();
    }

    public void onTransactionSaved() {
        view.setSummaryView();
    }
}
