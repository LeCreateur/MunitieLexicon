package nl.munitielexicon.munitielexicon.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nl.munitielexicon.munitielexicon.R;
import nl.munitielexicon.munitielexicon.WordMeaningActivity;

public class FragmentDefinition extends Fragment {

    public FragmentDefinition () {
        //Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition,container, false);
        //Inflate Layout

        Context context=getActivity();

        TextView text = (TextView) view.findViewById(R.id.textViewD);

        String mun_definitie= ((WordMeaningActivity)context).mundefinitie;
        text.setText((mun_definitie));

        if(mun_definitie==null)
        {
            text.setText("No definition found");
        }

        return view;
    }
}

