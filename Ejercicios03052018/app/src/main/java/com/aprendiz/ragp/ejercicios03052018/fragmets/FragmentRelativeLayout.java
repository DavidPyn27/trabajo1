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
public class FragmentRelativeLayout extends Fragment implements View.OnClickListener {


    public FragmentRelativeLayout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Button bt1, btn2, btn3, btn4;
        View view = inflater.inflate(R.layout.fragment_fragment_relative_layout, container, false);

        bt1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);


        bt1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(getActivity(), "Etiqueta =  android:layout_centerHorizontal=\"true\"", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.btn2:
                Toast.makeText(getActivity(), "Etiqueta = android:layout_centerInParent=\"true\"", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.btn3:
                Toast.makeText(getActivity(), "Etiqueta = android:layout_centerHorizontal=\"true\"", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.btn4:
                Toast.makeText(getActivity(), "Etiqueta = android:layout_centerVertical=\"true\"", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
