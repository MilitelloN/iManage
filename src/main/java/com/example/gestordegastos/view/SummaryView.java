package com.example.gestordegastos.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;
import com.example.gestordegastos.presenter.SummaryPresenter;

public class SummaryView extends AppCompatActivity {

    private final SummaryPresenter presenter;


    public SummaryView() {
        this.presenter = new SummaryPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_activity);

//        Button bttnAddTransaction = findViewById(R.id.bttn_addTrans);

//        bttnAddTransaction.setOnClickListener(bttnListener);
    }

    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.bttn_addTrans) {
                setAddTransactionActivity();
            } else {
                throw new IllegalStateException("Unexpected value: " + view.getId());
            }
        }
    };

    private void setAddTransactionActivity() {
        Intent addTransAct = new Intent(this, AddDebitTransView.class);
        startActivity(addTransAct);
    }
}
