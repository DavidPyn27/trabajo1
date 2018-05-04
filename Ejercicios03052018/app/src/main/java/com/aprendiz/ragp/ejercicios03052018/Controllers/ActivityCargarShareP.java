package com.aprendiz.ragp.ejercicios03052018.Controllers;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.aprendiz.ragp.ejercicios03052018.R;

public class ActivityCargarShareP extends AppCompatActivity {
    //Declaración de variables view
    TextView txtname;
    TextView txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargar_share_p);

        //Creación y obtención de bundle
        Bundle bundle=getIntent().getExtras();

        inicializar();

        //Ingreso de extras a los campos del layout
        txtname.setText(bundle.getString("user"));
        txtpass.setText(bundle.getString("pass"));


    }
    //Inicialización de componentes
    public void inicializar(){
        txtname = findViewById(R.id.txtnameAS);
        txtpass = findViewById(R.id.txtpassAS);
    }
}
