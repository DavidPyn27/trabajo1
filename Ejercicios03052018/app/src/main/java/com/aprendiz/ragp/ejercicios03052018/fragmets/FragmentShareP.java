package com.aprendiz.ragp.ejercicios03052018.fragmets;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.aprendiz.ragp.ejercicios03052018.Controllers.ActivityCargarShareP;
import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentShareP.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentShareP#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentShareP extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    EditText txtnombre;
    EditText txtpass;
    Button btnsave, btnload;

    private OnFragmentInteractionListener mListener;

    public FragmentShareP() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentShareP.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentShareP newInstance(String param1, String param2) {
        FragmentShareP fragment = new FragmentShareP();
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
        View v= inflater.inflate(R.layout.fragment_fragment_share, container, false);
        inicializar(v);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarPreferencias(v);
            }
        });

        btnload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarpreferencias();
            }
        });

        return v;
    }

    private void cargarpreferencias() {

        Intent intent = new Intent(getContext(), ActivityCargarShareP.class);

        SharedPreferences preferences = this.getActivity().getSharedPreferences("credenciales",Context.MODE_PRIVATE);

        String user=preferences.getString("user","no hay datos disponibles");
        String pass=preferences.getString("password","no hay datos disponibles");

        Bundle bundle=new Bundle();
        bundle.putString("user",user);
        bundle.putString("pass",pass);
        intent.putExtras(bundle);

        startActivity(intent);

    }

    private void guardarPreferencias(View v) {
        if (txtnombre.getText().toString().length()>0 && txtpass.getText().toString().length()>0) {
            SharedPreferences preferences = this.getActivity().getSharedPreferences("credenciales", Context.MODE_PRIVATE);
            String usuario = txtnombre.getText().toString();
            String pass = txtpass.getText().toString();
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("user", usuario);
            editor.putString("password", pass);
            editor.commit();
            txtnombre.setText(null);
            txtpass.setText(null);
            Snackbar.make(v, "Datos guardados", Snackbar.LENGTH_SHORT).show();
        }else{
            Snackbar.make(v, "Por favor ingresa los campos", Snackbar.LENGTH_SHORT).show();
        }

    }

    void inicializar(View v){
        txtnombre= v.findViewById(R.id.txtnameS);
        txtpass= v.findViewById(R.id.txtpassS);
        btnsave= v.findViewById(R.id.btnaceptarS);
        btnload= v.findViewById(R.id.btncargarS);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
