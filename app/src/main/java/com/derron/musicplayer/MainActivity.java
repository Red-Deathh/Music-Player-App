package com.derron.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        PageAdapter adapter;

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new AllSongs(),null).commit();

        adapter = new PageAdapter(getSupportFragmentManager(),bottomNavigationView.getMaxItemCount());
        viewPager.setAdapter(adapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedfragment = null;

            switch (menuItem.getItemId()){
                case R.id.songlist:
                    selectedfragment = new AllSongs();
                    break;
                case R.id.playlist:
                    selectedfragment = new Playlist();
                    break;
                case R.id.album:
                    selectedfragment = new Album();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedfragment,null).commit();
            return true;
        }
    };
}