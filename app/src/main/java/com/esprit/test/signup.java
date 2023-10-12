package com.esprit.test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class signup extends Fragment {
    TextView signin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_signup, container, false);
        signin=view.findViewById(R.id.signin);
        signin.setOnClickListener(view1 -> {

            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,new signin()).commit();

        });

        // Inflate the layout for this fragment
        return view;
    }
}