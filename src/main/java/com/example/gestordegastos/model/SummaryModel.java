package com.example.gestordegastos.model;

import com.example.gestordegastos.presenter.SummaryPresenter;

public class SummaryModel {
    SummaryPresenter presenter;

    public SummaryModel(SummaryPresenter summaryPresenter) {
        this.presenter = summaryPresenter;
    }
}
