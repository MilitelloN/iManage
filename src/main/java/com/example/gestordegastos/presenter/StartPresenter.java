package com.example.gestordegastos.presenter;

import android.content.Context;

import com.example.gestordegastos.model.StartModel;
import com.example.gestordegastos.view.StartView;

public class StartPresenter {

    private final StartView startView;
    private final StartModel startModel;


    public StartPresenter(StartView startView) {
        this.startView = startView;
        this.startModel = new StartModel(this);
    }

    public void setSummaryView(Context ctx) {
        startModel.setSummaryView(ctx);
    }

    public void accountsFound() {
        startView.setSummaryView();
    }
}
