package com.esprit.test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class signin extends Fragment {

    TextView signup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_signin, container, false);
        signup=view.findViewById(R.id.tvOr);
        signup.setOnClickListener(view1 -> {

            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,new signup()).commit();

        });
        return view;
    }
}