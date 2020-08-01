package com.derron.musicplayer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

class PageAdapter extends FragmentStatePagerAdapter {

    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AllSongs();
            case 1:
                return new Playlist();
            case 2:
                return new Album();
            default:return new AllSongs();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
