package com.example.alessio.infinity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.view.View.GONE;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendlyFragment extends Fragment {

    public static String friedlytype ;
    Button re ,hi_tag ,util ;

    public FriendlyFragment() {
        // Required empty public constructor
    }


    public static FriendlyFragment createFragment (String tipo)
    {

        FriendlyFragment Frag = new FriendlyFragment ();
        friedlytype = tipo;
        return Frag;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup =(ViewGroup) inflater.inflate(R.layout.fragment_friendly, container, false);
        re = (Button)viewGroup.findViewById(R.id.bf2);
        hi_tag = (Button)viewGroup.findViewById(R.id.bf1);
        util = (Button)viewGroup.findViewById(R.id.bf3);

        if(friedlytype.equalsIgnoreCase("HACKING")){
            //non fare nulla
        }

        if(friedlytype.equalsIgnoreCase("PLUS")){

        }
        if (friedlytype.equalsIgnoreCase("DEF_HACK"))
        {
            re.setVisibility(GONE);
        }
        if (friedlytype.equalsIgnoreCase("AssHack"))
        {
            re.setVisibility(GONE);
            hi_tag.setVisibility(GONE);
            util.setVisibility(GONE);
        }
        if (friedlytype.equalsIgnoreCase("EvoHack"))
        {

        }
        if (friedlytype.equalsIgnoreCase("Killer"))
        {
            re.setVisibility(GONE);
            hi_tag.setVisibility(GONE);
        }
        if (friedlytype.equalsIgnoreCase("WhiteHack"))
        {
            re.setVisibility(GONE);
        }
        if (friedlytype.equalsIgnoreCase("Pherower"))
        {
            re.setVisibility(GONE);
            hi_tag.setVisibility(GONE);
        }





        return viewGroup;
    }

}
