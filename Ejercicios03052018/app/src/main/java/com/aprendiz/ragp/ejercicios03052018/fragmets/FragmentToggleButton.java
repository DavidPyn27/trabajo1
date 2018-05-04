package com.aprendiz.ragp.ejercicios03052018.fragmets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentToggleButton extends Fragment {
    //Declaración de variables view
    ToggleButton toggleButton1;
    TextView textView1;

    public FragmentToggleButton() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_fragment_toggle_button, container, false);

        inicializar(v);

        //Método para la interación del toggle button
        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton1.isChecked()) {
                    textView1.setText("Botón On");
                } else {
                    textView1.setText("Botón Off");
                }
            }
        });
        return v;
    }

    //Inicializar los componetes del fragmento
    public void inicializar(View v){
        toggleButton1= v.findViewById(R.id.toggleButtonFB);
        textView1= v.findViewById(R.id.txtViewFB);

    }


}
