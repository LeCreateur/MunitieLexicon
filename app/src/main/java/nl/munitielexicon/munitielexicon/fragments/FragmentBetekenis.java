package nl.munitielexicon.munitielexicon.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nl.munitielexicon.munitielexicon.R;

public class FragmentBetekenis extends Fragment {

    public FragmentBetekenis() {
        //Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition,container, false);
        //Inflate Layout


        return view;
    }
}

