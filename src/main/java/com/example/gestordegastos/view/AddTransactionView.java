package com.example.gestordegastos.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;

public class AddTransactionView extends AppCompatActivity {

    public AddTransactionView() {
//        this.presenter = new SummaryPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtransaction_activity);
    }
}
