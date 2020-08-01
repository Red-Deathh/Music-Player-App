package com.derron.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {


    Button pre, pp, next;
    TextView songtxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mpE = MediaPlayer.create(MainActivity.this, R.raw.test);


        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_songs, R.id.navigation_playlist, R.id.navigation_album)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);


        pre = findViewById(R.id.btn_pre);
        pp = findViewById(R.id.btn_pp);
        next = findViewById(R.id.btn_next);
        songtxt = findViewById(R.id.song_txt);

        songtxt.setVisibility(View.INVISIBLE);


        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mpE.isPlaying()) {

                    mpE.pause();
                    pp.setBackgroundResource(R.drawable.ic_baseline_play_arrow_24);

                } else {
                    pp.setBackgroundResource(R.drawable.ic_baseline_pause_24);
                    mpE.start();
                    songtxt.setText("Kabhi Saam....");
                    songtxt.setVisibility(View.VISIBLE);

                }

            }
        });


    }

}