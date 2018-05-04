package com.aprendiz.ragp.ejercicios03052018.fragmets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSwitch extends Fragment {


    public FragmentSwitch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final Switch switcheE;
        final TextView txt1;
        View view = inflater.inflate(R.layout.fragment_fragment_switch, container, false);

        switcheE = view.findViewById(R.id.switchOp); //Inicializamos objetos
        txt1 = view.findViewById(R.id.txt1);


        switcheE.setOnClickListener(new View.OnClickListener() { //Metodo de click para el boton
            @Override
            public void onClick(View v) {
                if (switcheE.isChecked()){          //Validamos que opcion esta tomando en el switch
                    txt1.setText("Fue Activado");

                }else {
                    txt1.setText("Fue inactivado");
                }
            }

        });

        return view;
    }

}
