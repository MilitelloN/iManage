package com.example.gestordegastos.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gestordegastos.R;

public class StartActivity extends AppCompatActivity {

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);

        builder = new AlertDialog.Builder(StartActivity.this);
//        Button bttnAdd = findViewById(R.id.bttn_add);
//        Button bttnSummary = findViewById(R.id.bttn_summary);

//        bttnAdd.setOnClickListener(bttnListener);
//        bttnSummary.setOnClickListener(bttnListener);
    }

    private View.OnClickListener bttnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
//            if (id == R.id.bttn_add) {
//                showAD("Probando boton 1");
//            } else if (id == R.id.bttn_summary) {
//                showAD("Probando boton 2");
//            } else {
//                throw new IllegalStateException("Unexpected value: " + view.getId());
//            }
        }
    };
    private void showAD(String msg) {
        builder.setMessage(msg);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
