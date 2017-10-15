package com.example.alessio.infinity;


import android.app.DownloadManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


/**
 * A simple {@link Fragment} subclass.
 */
public class HackingName extends Fragment {




    private static String target, device;
    private static Boolean isEnemy;
    private RecyclerView rc;
    private FirebaseRecyclerAdapter<Program, HackingViewholder> adapter;


    public HackingName() {
        // Required empty public constructor
    }

    public static HackingName newFrag(String d, Boolean e, String t){
        device  = d;
        isEnemy = e;
        target = t;

        HackingName newFrag = new HackingName();
        return  newFrag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_hacking_name, container, false);
        rc = viewGroup.findViewById(R.id.recyclerView);
        rc.setLayoutManager(new LinearLayoutManager(getActivity()));

        Query query;

        FirebaseRecyclerOptions<Program> dati;


        String controllo;

        if(isEnemy){
            controllo = "Enemy";
        }else{
            controllo = "Friendly";
        }


        query = FirebaseDatabase.getInstance().getReference().child("HACKING").child("ENEMY").child("HEAVY_INFANTRY");
        // query = FirebaseDatabase.getInstance().getReference().child(device).child(controllo).child(target);

         dati =
                    new FirebaseRecyclerOptions.Builder<Program>()
                            .setQuery(query, Program.class)
                            .build();






        adapter = new FirebaseRecyclerAdapter<Program, HackingViewholder>(dati) {

            @Override
            public HackingViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(getActivity()).inflate(R.layout.hacking_card_view, parent, false);
                return new HackingViewholder(view);
            }

            @Override
            protected void onBindViewHolder(HackingViewholder holder, int position, Program model) {
                holder.setAttack(model.atk);
                holder.setHackingName(model.code);
                holder.setSkill(model.skill);
                holder.setProgram(model.program);
            }


        };

        rc.setAdapter(adapter);



        return viewGroup;
    }


    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();

    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
