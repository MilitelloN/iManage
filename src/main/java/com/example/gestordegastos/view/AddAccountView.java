package com.example.gestordegastos.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;
import com.example.gestordegastos.presenter.AddAccountPresenter;

public class AddAccountView extends AppCompatActivity {
    private final AddAccountPresenter presenter;

    public AddAccountView(){
        this.presenter = new AddAccountPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addaccount_activity);

        Button bttnCreateAccount = findViewById(R.id.bttnAddAccountActAddAcc);
        Button bttnCancel = findViewById(R.id.bttnCancelActAddAcc);

        bttnCreateAccount.setOnClickListener(bttnListener);
        bttnCancel.setOnClickListener(bttnListener);

    }

    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.bttnAddAccountActAddAcc) {
                presenter.saveNewAccount(); // I must send all data entered in the view, created in sql and update the list of accounts.
            } else if(view.getId() == R.id.bttnCancelActAddAcc) {
                setStartView();
            } else {
                throw new IllegalStateException("Unexpected value: " + view.getId());
            }
        }
    };

    private void setStartView() {
        Intent intent = new Intent(getApplicationContext(),StartView.class);
        startActivity(intent);
    }

    public void setSummaryView() {
        Intent intent = new Intent(getApplicationContext(),SummaryView.class);
        startActivity(intent);
    }
}
