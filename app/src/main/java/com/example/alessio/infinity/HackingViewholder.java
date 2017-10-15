package com.example.alessio.infinity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;



public class HackingViewholder extends RecyclerView.ViewHolder {


    TextView hackingName, program, skill ,attack;

    public HackingViewholder(View itemView) {
        super(itemView);

        hackingName = itemView.findViewById(R.id.hacking_name);
        program = itemView.findViewById(R.id.program);
        attack = itemView.findViewById(R.id.attack);

    }


    void setHackingName (String name){
        hackingName.setText(name);
    }


    void setProgram (String program_name){
        program.setText(program_name);
    }

    void setSkill(String skill_name){
        skill.setText(skill_name);
    }

    void setAttack(String atk){
        attack.setText(atk);
    }
}
