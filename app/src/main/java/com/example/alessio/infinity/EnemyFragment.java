package com.example.alessio.infinity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;


/**
 * A simple {@link Fragment} subclass.
 */
public class EnemyFragment extends Fragment {


    public static String device;


    Button hi ,re ,tag , hack , util ;

    public EnemyFragment() {
        // Required empty public constructor
    }

    public static EnemyFragment newInstance(String d){

        EnemyFragment newFrag = new EnemyFragment();

        device = d;
        return newFrag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup viewGroup = (ViewGroup)inflater.inflate(R.layout.fragment_enemy, container, false);




        hi = (Button)viewGroup.findViewById(R.id.b1);
        re = (Button)viewGroup.findViewById(R.id.b2);
        tag = (Button)viewGroup.findViewById(R.id.b3);
        hack = (Button)viewGroup.findViewById(R.id.b4);
        util = (Button)viewGroup.findViewById(R.id.b5);

        if(device.equalsIgnoreCase("HACKING")){
            //non fare nulla
        }

        if(device.equalsIgnoreCase("PLUS")){

        }
        if (device.equalsIgnoreCase("DEF_HACK"))
        {
            re.setVisibility(GONE);
            hi.setVisibility(GONE);
            tag.setVisibility(GONE);
        }
        if (device.equalsIgnoreCase("AssHack"))
        {

        }
        if (device.equalsIgnoreCase("EvoHack"))
        {
            re.setVisibility(GONE);
            hi.setVisibility(GONE);
            tag.setVisibility(GONE);
        }
        if (device.equalsIgnoreCase("Killer"))
        {
            re.setVisibility(GONE);
            hi.setVisibility(GONE);
            tag.setVisibility(GONE);
            util.setVisibility(GONE);
        }
        if (device.equalsIgnoreCase("WhiteHack"))
        {
            re.setVisibility(GONE);
            hi.setVisibility(GONE);
            tag.setVisibility(GONE);
        }
        if (device.equalsIgnoreCase("Pherower"))
        {
            re.setVisibility(GONE);
            hi.setVisibility(GONE);
            tag.setVisibility(GONE);
            hack.setVisibility(GONE);
        }


        //test
        hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HackingName frag = HackingName.newFrag(device, true, "HEAVY_INFANTRY");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, frag).commit() ;
            }
        });





        return viewGroup;
    }




}
