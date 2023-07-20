package com.example.gestordegastos.presenter;

import com.example.gestordegastos.model.AddTransactionModel;
import com.example.gestordegastos.view.AddTransactionView;

public class AddTransactionPresenter {

    private final AddTransactionView view;
    private final AddTransactionModel model;

    public AddTransactionPresenter(AddTransactionView addTransactionView) {
        this.view = addTransactionView;
        this.model = new AddTransactionModel(this);
    }


    public void saveTransaction() {
        model.saveTransaction();
    }

    public void onTransactionSaved() {
        view.setSummaryView();
    }
}
