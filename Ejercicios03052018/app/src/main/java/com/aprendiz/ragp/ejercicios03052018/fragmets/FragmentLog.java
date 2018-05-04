package com.aprendiz.ragp.ejercicios03052018.fragmets;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aprendiz.ragp.ejercicios03052018.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentLog.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentLog#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentLog extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    private static final String TAG="Seguimiento";

    public FragmentLog() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentLog.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentLog newInstance(String param1, String param2) {
        FragmentLog fragment = new FragmentLog();
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
        //Escribir en la consola
        Log.i("info","Valor información: ");
        Log.d("Debug","Valor Debug: ");
        Log.w("Warning","Valor Warning: ");
        Log.e("Error","Valor Error: ");
        Log.d("Verbose","Valor Verbose: ");

        //Escribir en la consola con un TAG identificador
        Log.i(TAG,"Mensaje Seguimiento 1: ");
        Log.d(TAG,"Mensaje Seguimiento 2: ");
        Log.w(TAG,"Mensaje Seguimiento 3: ");
        Log.e(TAG,"Mensaje Seguimiento 4: ");
        Log.d(TAG,"Mensaje Seguimiento 5: ");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_log, container, false);
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
