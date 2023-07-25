package com.example.gestordegastos.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;
import com.example.gestordegastos.database.DatabaseBuilder;
import com.example.gestordegastos.database.entities.Account;
import com.example.gestordegastos.presenter.AddAccountPresenter;

import java.util.List;

public class AddAccountView extends AppCompatActivity {
    private final AddAccountPresenter presenter;


        private EditText accountName;
        private EditText accountDesc;
        private Switch accountType;
        private EditText prevDate;
        private EditText currDate;
        private EditText nextDate;


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

        // Form fields:
        this.accountName = findViewById(R.id.txtNameAccActAddAcc);
        this.accountDesc = findViewById(R.id.txtDescActAddAcc);
        this.accountType = findViewById(R.id.swAccTypeActAddAcc);
        this.prevDate = findViewById(R.id.txtPrevDateActAddAcc);
        this.currDate = findViewById(R.id.txtCurrDateActAddAcc);
        this.nextDate = findViewById(R.id.txtNextDateActAddAcc);
    }

    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.bttnAddAccountActAddAcc) {
                presenter.saveNewAccount(getApplicationContext(), accountName.getText().toString(), accountDesc.getText().toString(), accountType.isChecked(), prevDate.getText().toString(),currDate.getText().toString(),nextDate.getText().toString());
            } else if(view.getId() == R.id.bttnCancelActAddAcc) {
                finish();
            } else {
                throw new IllegalStateException("Unexpected value: " + view.getId());
            }
        }
    };


    public void setSummaryView() {
        List<Account> acc = DatabaseBuilder.getBD(getApplicationContext()).daoAccount().getAllAccounts();

        for (Account a : acc) {
            Toast.makeText(this,a.toString(), Toast.LENGTH_LONG).show();
        }

//        Intent intent = new Intent(getApplicationContext(),SummaryView.class);
//        startActivity(intent);
//
//        finish();
    }
}
