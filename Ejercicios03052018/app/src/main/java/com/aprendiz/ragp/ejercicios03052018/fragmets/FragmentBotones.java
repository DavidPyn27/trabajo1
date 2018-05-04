package com.aprendiz.ragp.ejercicios03052018.fragmets;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentBotones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentBotones extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Button btnanoni,btnimple,btnonclick;


    public FragmentBotones() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentBotones.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentBotones newInstance(String param1, String param2) {
        FragmentBotones fragment = new FragmentBotones();
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
        View v = inflater.inflate(R.layout.fragment_fragment_botones, container, false);
        inicializar(v);

        //Agregar método onClick desde clase anonima para el btnanoni
        btnanoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Desde la anonima",Snackbar.LENGTH_SHORT).show();
            }
        });
        //Agregar método onClick desde implements para el btnimple
        btnimple.setOnClickListener(this);
        btnonclick.setOnClickListener(this);
        return v;
    }
    //Inicialización de los componetes
    void inicializar(View v){
        btnanoni= v.findViewById(R.id.btnanoni);
        btnimple= v.findViewById(R.id.btnimple);
        btnonclick=v.findViewById(R.id.btnonclick);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnimple:
                Snackbar.make(v,"Desde el on click del implement",Snackbar.LENGTH_SHORT).show();
                break;

            case R.id.btnonclick:
                Snackbar.make(v,"Desde el on click del método",Snackbar.LENGTH_SHORT).show();
                break;
        }

    }
}
