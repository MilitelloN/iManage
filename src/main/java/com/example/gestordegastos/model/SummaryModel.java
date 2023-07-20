package com.example.gestordegastos.model;

import android.util.Log;
import android.widget.Toast;

import com.example.gestordegastos.presenter.SummaryPresenter;

public class SummaryModel {
    SummaryPresenter presenter;

    public SummaryModel(SummaryPresenter summaryPresenter) {
        this.presenter = summaryPresenter;
    }

    public void generateSummary() {
        Log.i("TOAST","Aca deberia generar y descargar el pdf");
    }
}
