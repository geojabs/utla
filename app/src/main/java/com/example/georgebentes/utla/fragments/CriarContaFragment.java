package com.example.georgebentes.utla.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.georgebentes.utla.R;

/**
 * Created by George Bentes on 08/02/2016.
 */
public class CriarContaFragment extends Fragment {

    private Button btSugerir;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_criar_conta, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btSugerir = (Button)view.findViewById(R.id.bt_sugerir);
        btSugerir.setOnClickListener(btClickListener);
    }

    private View.OnClickListener btClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.bt_sugerir:
                    FragmentTransaction fragTransaction = getActivity().getSupportFragmentManager()
                                                                       .beginTransaction();

                    AnimaisFragment animaisFragment = new AnimaisFragment();
                    fragTransaction.addToBackStack("criarContaFragment");
                    fragTransaction.replace(R.id.activity_main_frame_layout, animaisFragment,
                                                                            "animaisFragment");
                    fragTransaction.commit();

                    break;
            }
        }
    };
}
