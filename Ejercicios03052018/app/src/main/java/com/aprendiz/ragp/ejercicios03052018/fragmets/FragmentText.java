package com.aprendiz.ragp.ejercicios03052018.fragmets;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
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
 * Use the {@link FragmentText#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentText extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    //Declaración de variables view
    Button btn1;
    TextView etiqueta;
    EditText campo1, campo2, campo3;


    public FragmentText() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentText.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentText newInstance(String param1, String param2) {
        FragmentText fragment = new FragmentText();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_fragment_text, container, false);
        inicializar(v);
        //Método para el ingreso de datos
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obtenerinfo(v);
            }
        });

        return v;
    }


    //Inicializacion de componentes
    public void inicializar(View v){
        btn1= v.findViewById(R.id.btningresarTe);
        etiqueta= v.findViewById(R.id.txtcomponete);
        campo1= v.findViewById(R.id.txtdocumento);
        campo2= v.findViewById(R.id.txtpassword);
        campo3= v.findViewById(R.id.txttexto);
    }

    //Método para obtener la información de los campos de texto
    private void obtenerinfo(View v) {

        String doc=campo1.getText().toString();
        int numero=0;
        if (doc.length()>0){
            numero= Integer.parseInt(doc);
        }
        String pass=campo2.getText().toString();
        String parrafo=campo3.getText().toString();


        etiqueta.setText("Nuevo título");
        Snackbar.make(v,"Dato númerico: "+ Integer.toString(numero),Snackbar.LENGTH_SHORT).show();
        Snackbar.make(v,"Dato password: "+ pass,Snackbar.LENGTH_SHORT).show();
        Snackbar.make(v,"Dato parrafo: "+ parrafo,Snackbar.LENGTH_SHORT).show();

    }

}
