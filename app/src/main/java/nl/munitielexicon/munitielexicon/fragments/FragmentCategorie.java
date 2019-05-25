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

public class FragmentCategorie extends Fragment {

    public FragmentCategorie() {
        //Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_definition,container, false);
        //Inflate Layout

        Context context=getActivity();
        TextView text = (TextView) view.findViewById(R.id.textViewD);//Find textView Id

        String categorie= ((WordMeaningActivity)context).categorie;

        if(categorie!=null)
        {
            categorie = categorie.replaceAll(",", ",\n");
            text.setText(categorie);
        }
        if(categorie==null)
        {
            text.setText("No category found");
        }
        return view;
    }
}

