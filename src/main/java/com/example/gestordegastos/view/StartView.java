package com.example.gestordegastos.view;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;
import com.example.gestordegastos.presenter.StartPresenter;

public class StartView extends AppCompatActivity {
    private final StartPresenter startPresenter;

    public StartView() {
        this.startPresenter = new StartPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        Button bttnSummary = findViewById(R.id.bttn_summary);
        Button bttnCreateAcc = findViewById(R.id.bttn_createAcc);

        bttnSummary.setOnClickListener(bttnListener);
        bttnCreateAcc.setOnClickListener(bttnListener);
    }


    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.bttn_summary) {
                startPresenter.setSummaryView(getApplicationContext());
            } else if (view.getId() == R.id.bttn_createAcc) {
              setCreateAccountView();
            } else {
                throw new IllegalStateException("Unexpected value: " + view.getId());
            }
        }
    };

    private void setCreateAccountView() {
        Intent intent = new Intent(this, AddAccountView.class);
        startActivity(intent);
    }

    public void setSummaryView() {
        Intent intent = new Intent(this, SummaryView.class);
        startActivity(intent);

    }
}


