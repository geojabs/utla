package com.example.georgebentes.utla.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.georgebentes.utla.R;
import com.example.georgebentes.utla.util.UtlaUtils;

/**
 * Created by George Bentes on 06/02/2016.
 */
public class CidadesFragment extends Fragment {

    private ImageView imgBlumenau, imgNatal, imgManaus, imgCuritiba;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cidades, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgBlumenau = (ImageView)view.findViewById(R.id.img_cidade_blumenau);
        imgBlumenau.setOnClickListener(imgCidadeClickListener);

        imgNatal = (ImageView)view.findViewById(R.id.img_cidade_natal);
        imgNatal.setOnClickListener(imgCidadeClickListener);

        imgManaus = (ImageView)view.findViewById(R.id.img_cidade_manaus);
        imgManaus.setOnClickListener(imgCidadeClickListener);

        imgCuritiba = (ImageView)view.findViewById(R.id.img_cidade_curitiba);
        imgCuritiba.setOnClickListener(imgCidadeClickListener);
    }

    private View.OnClickListener imgCidadeClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String cidadeSelecionada = v.getResources().getResourceName(v.getId());
            cidadeSelecionada = cidadeSelecionada.replace("com.example.georgebentes.utla:id/img_cidade_", "");
            cidadeSelecionada = UtlaUtils.capitalizar(cidadeSelecionada);

            Toast.makeText(getActivity(), "Selecionou: " + cidadeSelecionada, Toast.LENGTH_SHORT).show();
            UtlaUtils.nomeUsuario += UtlaUtils.pegarConsoantes(cidadeSelecionada);
            UtlaUtils.nomeUsuario = UtlaUtils.gerarNomeUsuarioAleatorio();
            System.out.println(">>>>> NOME DO USUARIO GERADO:  " + UtlaUtils.nomeUsuario);
        }
    };
}
