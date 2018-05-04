package com.aprendiz.ragp.ejercicios03052018.fragmets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCheckBox extends Fragment {


    public FragmentCheckBox() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button btn1,btnToas;
        final CheckBox c1, c2;

        View view = inflater.inflate(R.layout.fragment_fragment_check_box, container, false);


        // Inicializamos los elementos puestos en el xml

        btn1 = view.findViewById(R.id.btn1);
        btnToas= view.findViewById(R.id.btnToast);
        c1 = view.findViewById(R.id.Check1);
        c2 = view.findViewById(R.id.Check2);


        btn1.setOnClickListener(new View.OnClickListener() {  // Definimos el evento click para el boton
            @Override
            public void onClick(View v) {
                validar(); // creamos metodo validar
            }

            private void validar() {
                String cad= "Seleccionado: \n";

                if (c1.isChecked()){        // Validamos las opciones
                    cad+="Opcion1 \n" ;
                }
                if (c2.isChecked()){
                    cad+="Opcion2";

                }

                Toast.makeText(getContext(),cad,Toast.LENGTH_LONG).show(); // Mostramos el mensaje de la opcion
            }
        });

        btnToas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Hola Zulema",Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }

}
