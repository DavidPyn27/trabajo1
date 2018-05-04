package com.aprendiz.ragp.ejercicios03052018.fragmets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCalculadora extends Fragment {


    public FragmentCalculadora() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button btnsumar, btnrestar, btnmulti, btndivi;
        EditText campo1, campo2;
        final TextView resultado;
        final int num1;
        final int num2;

        View view = inflater.inflate(R.layout.fragment_fragment_calculadora, container, false);

        btnsumar = view.findViewById(R.id.btnSumar);
        btnrestar = view.findViewById(R.id.btnRestar);
        btndivi = view.findViewById(R.id.btnDividir);
        btnmulti = view.findViewById(R.id.btnMultiplicar);
        campo1 = view.findViewById(R.id.campo1);
        campo2 = view.findViewById(R.id.campo2);
        resultado = view.findViewById(R.id.etiResultado);

        num1 = Integer.parseInt(campo1.getText().toString());
        num2 = Integer.parseInt(campo2.getText().toString());



        btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = num1+num2;
                resultado.setText("El resultado es :"  +sum);
            }
        });

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = num1-num2;
                resultado.setText("El resultado es:  "+ res);
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int multi = num1 * num2;
                resultado.setText("El resultado es : " + multi);
            }
        });


        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int divi = num1/num2;
                resultado.setText("El resultado es :"  +divi);
            }
        });

        return view;
    }

}
