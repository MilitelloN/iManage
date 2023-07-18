package com.example.gestordegastos.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;
import com.example.gestordegastos.presenter.SummaryPresenter;

public class AddDebitTransView extends AppCompatActivity {

    public AddDebitTransView() {
//        this.presenter = new SummaryPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtrans_debit_activity);
    }
}
