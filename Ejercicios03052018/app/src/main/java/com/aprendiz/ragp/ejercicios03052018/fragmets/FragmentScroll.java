package com.aprendiz.ragp.ejercicios03052018.fragmets;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentScroll extends Fragment {


    public FragmentScroll() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button btnRegistrar;
        View view = inflater.inflate(R.layout.fragment_fragment_scroll, container, false);

        btnRegistrar = view.findViewById(R.id.registrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getActivity(), "Sus Datos se han registrado correctamente", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

}
