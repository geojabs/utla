package com.example.georgebentes.utla.fragments;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.georgebentes.utla.R;
import com.example.georgebentes.utla.util.UtlaUtils;

/**
 * Created by George Bentes on 10/02/2016.
 */
public class ResultadoNomeUsuarioFragment extends Fragment {

    private FrameLayout activityLayout;
    private TextView textViewNomeUsuario;
    private Button btGerarOutro;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultado_nome_usuario, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        activityLayout = (FrameLayout)getActivity().findViewById(R.id.activity_main_frame_layout);
        activityLayout.setBackgroundColor(Color.WHITE);

        textViewNomeUsuario = (TextView)view.findViewById(R.id.text_view_nome_usuario);
        textViewNomeUsuario.setText(UtlaUtils.nomeUsuario.toLowerCase());

        btGerarOutro = (Button)view.findViewById(R.id.bt_gerar_outro);
        btGerarOutro.setOnClickListener(btGerarOutroListener);
    }

    private View.OnClickListener btGerarOutroListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Drawable drawable = ContextCompat.getDrawable(getActivity(),
                                                          R.drawable.main_activity_background);
            activityLayout.setBackground(drawable);

            FragmentTransaction fragTransaction = getFragmentManager().beginTransaction();
            AnimaisFragment animaisFragment = new AnimaisFragment();
            fragTransaction.replace(R.id.activity_main_frame_layout, animaisFragment, "animaisFragment");
            fragTransaction.commit();
        }
    };
}
