package com.example.gestordegastos.presenter;

import android.content.Context;

import com.example.gestordegastos.model.SummaryModel;
import com.example.gestordegastos.view.SummaryView;

public class SummaryPresenter {

    private final SummaryView view;
    private final SummaryModel model;


    public SummaryPresenter(SummaryView summaryView) {
        this.view = summaryView;
        this.model = new SummaryModel(this);
    }

    public void downloadCurrentSummary() {
        this.model.generateSummary();
    }
}
