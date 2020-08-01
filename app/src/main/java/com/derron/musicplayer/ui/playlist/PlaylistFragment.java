package com.derron.musicplayer.ui.playlist;

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

public class PlaylistFragment extends Fragment {

    private PlaylistViewModel playlistViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        playlistViewModel =
                ViewModelProviders.of(this).get(PlaylistViewModel.class);
        View root = inflater.inflate(R.layout.fragment_playlist, container, false);




        return root;
    }
}