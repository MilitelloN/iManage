package com.example.gestordegastos.presenter;

import android.content.Context;

import com.example.gestordegastos.model.StartModel;
import com.example.gestordegastos.view.StartView;

public class StartPresenter {

    private final StartView view;
    private final StartModel model;


    public StartPresenter(StartView startView) {
        this.view = startView;
        this.model = new StartModel(this);
    }

    public void setSummaryView(Context ctx) {
        model.setSummaryView(ctx);
    }

    public void accountsFound() {
        view.setSummaryView();
    }
}
