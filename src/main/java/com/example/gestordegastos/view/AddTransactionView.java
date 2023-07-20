package com.example.gestordegastos.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;
import com.example.gestordegastos.presenter.AddTransactionPresenter;

public class AddTransactionView extends AppCompatActivity {

    AddTransactionPresenter presenter;

    public AddTransactionView() {
        this.presenter = new AddTransactionPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtransaction_activity);

        Button bttnAddTransaction = findViewById(R.id.bttn_AddTransaction);
        Button bttnCancel = findViewById(R.id.bttn_cancel);

        bttnAddTransaction.setOnClickListener(bttnListener);
        bttnCancel.setOnClickListener(bttnListener);

    }

    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.bttn_AddTransaction) {
                presenter.saveTransaction();
            } else if(view.getId() == R.id.bttn_cancel) {
                setSummaryView();
            } else {
                throw new IllegalStateException("Unexpected value: " + view.getId());
            }
        }
    };

    public void setSummaryView() {
        Intent intent = new Intent(getApplicationContext(),SummaryView.class);
        startActivity(intent);
    }
}
