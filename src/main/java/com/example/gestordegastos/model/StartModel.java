package com.example.gestordegastos.model;

import android.content.Context;

import com.example.gestordegastos.presenter.StartPresenter;

public class StartModel {

    private final StartPresenter startPresenter;

    public StartModel(StartPresenter startPresenter) {
        this.startPresenter = startPresenter;
    }

    public void setSummaryView(Context ctx) {
        // Check if it has any account
        /*
        *   if ( accounts.count() == 0)
        *       sendTo(noAccountsFoundView);
        *   else
        *       sendTo(summaryView_lastAccount);
        *
        * */
        startPresenter.accountsFound();
    }
}
