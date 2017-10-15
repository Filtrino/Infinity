package com.example.alessio.infinity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BitchActivity extends FragmentActivity {

    protected static void cambiapagina(){



    }
    TextView button_one, button_two;

    LinearLayout b1, b2, b3;
    FrameLayout frame ;

    String device;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitch);

        button_one  = findViewById(R.id.button_one);
        button_two = findViewById(R.id.button_two);
        frame = findViewById(R.id.container);




        //che nemico è ?????
        device = getIntent().getExtras().get("TIPO_DI_DEVICE").toString();

        if(device.equalsIgnoreCase("HACKING")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("HACKING");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();
        }



        if(device.equalsIgnoreCase("PLUS")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("PLUS");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();

        }
        if(device.equalsIgnoreCase("DEF_HACK")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("DEF_HACK");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();
        }
        if(device.equalsIgnoreCase("AssHack")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("AssHack");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();
        }
        if(device.equalsIgnoreCase("EvoHack")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("EvoHack");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();
        }
        if(device.equalsIgnoreCase("Killer")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("Killer");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();
        }
        if(device.equalsIgnoreCase("WhiteHack")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("WhiteHack");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();
        }
        if(device.equalsIgnoreCase("Pherower")){
            EnemyFragment enemyFragment = EnemyFragment.newInstance("Pherower");
            getSupportFragmentManager().beginTransaction().add(frame.getId(), enemyFragment).commit();

        }

        //add aggiunge fisicamente
        //replace rimpiazza eliminando il vecchio



        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EnemyFragment enemyFragment = EnemyFragment.newInstance(device);
                getSupportFragmentManager().beginTransaction().replace(frame.getId(), enemyFragment).commit();
            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FriendlyFragment friendlyFragment = FriendlyFragment.createFragment(device);
                getSupportFragmentManager().beginTransaction().replace(frame.getId(), friendlyFragment).commit();
            }
        });





    }
}
