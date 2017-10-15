package com.example.alessio.infinity;



import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {




        FrameLayout frame;
        FirebaseDatabase database ;
        DatabaseReference myRef ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i ;
        final FragmentManager fm ;

        Button HakDevice = (Button) findViewById(R.id.HackingDevice);
        Button Hackplus = (Button) findViewById(R.id.HackingDevicePlus);
        Button DefHack = (Button) findViewById(R.id.DefenseHackingDevice);
        Button AssHack = (Button) findViewById(R.id.AssaultHackingDevice);
        Button EvoHack =(Button)  findViewById(R.id.EvoHackingDevice);
        Button KilleerHack = (Button)findViewById(R.id.KillerHackingDevice);
        Button WhiteHack = (Button) findViewById(R.id.WhiteHackingDevice);
        Button Pherowwer = (Button) findViewById(R.id.Pheroware);

        frame = (FrameLayout) findViewById(R.id.cancell);
        final Program Claw_1_Gotcha = new Program("Claw-1","Gotcha","Short/ARO","0","0","13","2","-","2","imm-1");
        final Program Claw_1_Overlod = new Program("Claw-1","Overlod","Short/ARO","0","0","14","1","BRK","∞","Possesed");
        final Program Claw_1_Spotlight = new Program("Claw-1","Spotlight","Short","-3","0","-","1","-","1","Targeted");
        final Program program = new Program("Claw-1","Gotcha","Short/ARO","0","0","13","2","-","2","imm-1");


        fm = getSupportFragmentManager();
        // crea il frammento

        //Scrivere nel database
        database = database.getInstance();
        myRef = database.getReference("HACKING").child("ENEMY").child("HEAVY_INFANTRY").child(program.code);



        myRef.setValue(program);


        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
             Program  program = dataSnapshot.getValue(Program.class);
                Log.i("WEE", "" +program.ammo);
                Log.i("WEE", "" +program.atk);
                Log.i("WEE", "" +program.b);


            }

            @Override
            public void onCancelled(DatabaseError error) {
                Log.w("Error", "Failed to read value.", error.toException());

            }
        });



        HakDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent changePage = new Intent(MainActivity.this, BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE", "HACKING");
                startActivity(changePage);
            }
        });

        Hackplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePage = new Intent(MainActivity.this, BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE", "PLUS");
                startActivity(changePage);
            }
        });
        DefHack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePage = new Intent(MainActivity.this ,BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE" ,"DEF_HACK");
                startActivity(changePage);

            }
        });

        AssHack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePage = new Intent(MainActivity.this ,BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE" , "AssHack");
                startActivity(changePage);

            }
        });
        EvoHack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePage = new Intent(MainActivity.this , BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE", "EvoHack");
                startActivity(changePage);
            }
        });
        KilleerHack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePage = new Intent(MainActivity.this , BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE" ,"Killer");
                startActivity(changePage);
            }
        });
        WhiteHack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePage = new Intent(MainActivity.this,BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE","WhiteHack");
                startActivity(changePage);
            }
        });
        Pherowwer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePage = new Intent(MainActivity.this,BitchActivity.class);
                changePage.putExtra("TIPO_DI_DEVICE","Pherower");
                startActivity(changePage);
            }
        });





    }


}
