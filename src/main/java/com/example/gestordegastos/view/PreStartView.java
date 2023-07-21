package com.example.gestordegastos.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.gestordegastos.R;
import com.example.gestordegastos.databaseBuilder.DatabaseBuilder;
import com.example.gestordegastos.databaseBuilder.entities.AccountType;

import java.util.List;

public class PreStartView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prestart_activity);

        TextView txt = findViewById(R.id.txtVPreStart);

        txt.setText("Puto el que lee");

        DatabaseBuilder myDatabase = Room.databaseBuilder(getApplicationContext(),
                        DatabaseBuilder.class, "databaseTest")
                .allowMainThreadQueries() // ¡CUIDADO! Esto permite operaciones de base de datos en el hilo principal, lo cual no es recomendado para aplicaciones reales.
                .build();

        try {
            myDatabase.daoAccountTypes().insertAccountType(new AccountType(1,"Tipo1"));
        } catch (Exception e) {
            Log.e("TOAST","YA EXISTE ESTE usuario");
            myDatabase.daoAccountTypes().insertAccountType(new AccountType(2,"Tipo2"));
        }



        List<AccountType> accTypes = myDatabase.daoAccountTypes().getAllAccountTypes();
//
        String ejemplo = "";
        for (AccountType accT : accTypes ){
            String test = accT.getId() + " - " + accT.getName();
            ejemplo += (accT + "\n");
        }

        txt.setText(ejemplo);
    }
}
