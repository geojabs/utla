package com.example.georgebentes.utla.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.georgebentes.utla.R;

/**
 * Created by George Bentes on 06/02/2016.
 */
public class AnimaisFragment extends Fragment {

    private ImageView imgHamster, imgPeixe, imgZebra, imgPeriquito;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animais, container, false);
        return  view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgHamster = (ImageView)view.findViewById(R.id.img_animal_hamster);
        imgHamster.setOnClickListener(imgClickListener);

        imgPeixe = (ImageView)view.findViewById(R.id.img_animal_peixe);
        imgPeixe.setOnClickListener(imgClickListener);

        imgZebra = (ImageView)view.findViewById(R.id.img_animal_zebra);
        imgPeriquito = (ImageView)view.findViewById(R.id.img_animal_periquito);
    }

    private View.OnClickListener imgClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String animalSelecionado = v.getResources().getResourceName(v.getId());
            animalSelecionado = animalSelecionado.replace("com.example.georgebentes.utla:id/img_animal_", "");

            System.out.println("\n\n\nAnimal Selecionado >>>>>" + animalSelecionado + "\n\n\n\n");


        }
    };
}
