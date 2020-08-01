package com.derron.musicplayer.ui.songs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.derron.musicplayer.R;

public class SongFragment extends Fragment {

    private SongViewModel songViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        songViewModel =
                ViewModelProviders.of(this).get(SongViewModel.class);
        View root = inflater.inflate(R.layout.fragment_songs, container, false);



        return root;
    }
}