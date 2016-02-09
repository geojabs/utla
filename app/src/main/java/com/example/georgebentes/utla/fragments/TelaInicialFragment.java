package com.example.georgebentes.utla.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.georgebentes.utla.R;

/**
 * Created by George Bentes on 08/02/2016.
 */
public class TelaInicialFragment extends Fragment {

    private Button btCriarConta;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tela_inicial, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btCriarConta = (Button)view.findViewById(R.id.bt_criar_conta);
        btCriarConta.setOnClickListener(btClickListener);

        FragmentManager fManager = getFragmentManager();
        FragmentTransaction fTransaction = fManager.beginTransaction();
        EntrarFragment entrarFragment = new EntrarFragment();


    }


    private View.OnClickListener btClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.bt_criar_conta:
                    FragmentTransaction fragTransaction = getActivity().getSupportFragmentManager()
                                                                       .beginTransaction();
                    CriarContaFragment criarContaFragment = new CriarContaFragment();
                    fragTransaction.addToBackStack("telaInicialFragment");
                    fragTransaction.replace(R.id.activity_main_frame_layout, criarContaFragment,
                                                                             "criarContaFragment");
                    fragTransaction.commit();
                    break;


            }
        }
    };
}
