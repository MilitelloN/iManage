package com.example.gestordegastos.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;
import com.example.gestordegastos.presenter.SummaryPresenter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class SummaryView extends AppCompatActivity {
    private final SummaryPresenter presenter;

    public SummaryView() {
        this.presenter = new SummaryPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_activity);

        FloatingActionButton bttnAddTransaction = findViewById(R.id.bttn_addTrans);
        FloatingActionButton bttnDownload = findViewById(R.id.bttn_download);

        bttnAddTransaction.setOnClickListener(bttnListener);
        bttnDownload.setOnClickListener(bttnListener);
    }

    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.bttn_addTrans) {
                setAddTransactionActivity();
            } else if(view.getId() == R.id.bttn_download) {
                presenter.downloadCurrentSummary(); // This should send as parameter the filter selected and the context.
            } else {
                throw new IllegalStateException("Unexpected value: " + view.getId());
            }
        }
    };

    private void setAddTransactionActivity() {
        Intent addTransAct = new Intent(this, AddTransactionView.class);
        startActivity(addTransAct);
    }
}
