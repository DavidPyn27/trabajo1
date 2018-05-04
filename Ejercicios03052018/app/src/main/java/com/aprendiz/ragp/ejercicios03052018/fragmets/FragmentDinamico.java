package com.aprendiz.ragp.ejercicios03052018.fragmets;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentDinamico.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentDinamico#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDinamico extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    //Declaración de botones
    Button btn1,btn2,btn3;

    //Declaración de fragmentos
    Fragment fragmento1= new FragmentImagen1();
    Fragment fragmento2= new FragmentImagen2();
    Fragment fragmento3= new FragmentImagen3();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FragmentDinamico() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentDinamico.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentDinamico newInstance(String param1, String param2) {
        FragmentDinamico fragment = new FragmentDinamico();
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
        View v = inflater.inflate(R.layout.fragment_fragment_dinamico, container, false);
        inicializar(v);
        return v;
    }
    //Inicialización de botones y implementación del método setOnClickListener
    public void inicializar(View v){
        btn1=v.findViewById(R.id.btnfuno);
        btn2=v.findViewById(R.id.btnfdos);
        btn3=v.findViewById(R.id.btnftres);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    //Método onClick en en cual se podrá interactuar con los botones para el cambio de fragmentos
    @Override
    public void onClick(View v) {
        FragmentTransaction transaction=this.getActivity().getSupportFragmentManager().beginTransaction();

        switch (v.getId()){
            case R.id.btnfuno:
                transaction.replace(R.id.contenedorD,fragmento1);
                break;

            case R.id.btnfdos:
                transaction.replace(R.id.contenedorD,fragmento2);
                break;

            case R.id.btnftres:
                transaction.replace(R.id.contenedorD,fragmento3);
                break;

        }
        transaction.commit();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
