package com.example.shtabudsu.fragments;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;


import com.example.shtabudsu.R;

public class ThirtFragment extends Fragment {
    private VideoView videoView;
    private VideoView videoView2;
    private int position = 0;
    private MediaController mediaController;
    private MediaController mediaController2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_thirt, container, false);
        videoView = view.findViewById(R.id.videoView);
        videoView2 = view.findViewById(R.id.videoView2);
        if(mediaController == null){
            mediaController = new MediaController(getActivity());
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
        }
        if(mediaController2 == null){
            mediaController2 = new MediaController(getActivity());
            mediaController2.setAnchorView(videoView2);
            videoView2.setMediaController(mediaController2);
        }

        try {
            // ID of video file.
            int id = getRawResIdByName("zapusk18");
            int id2 = getRawResIdByName("few17");
            videoView.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + id));
            videoView2.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + id2));

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        videoView.requestFocus();
        videoView2.requestFocus();

        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(final MediaPlayer mediaPlayer) {
                videoView2.seekTo(position);
                if(position == 0){
                    videoView2.pause();
                }

                mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediaController2.setAnchorView(videoView2);
                    }
                });
            }
        });

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(final MediaPlayer mediaPlayer) {
                videoView.seekTo(position);
                if(position == 0){
                    videoView.pause();
                }

                mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediaController.setAnchorView(videoView);
                    }
                });
            }
        });

        return view;
    }



    public int getRawResIdByName(String resName) {
        String pkgName = getActivity().getPackageName();
        // Return 0 if not found.
        int resID = this.getResources().getIdentifier(resName, "raw", pkgName);
        Log.i("AndroidVideoView", "Res Name: " + resName + "==> Res ID = " + resID);
        return resID;
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        // Store current position.
        savedInstanceState.putInt("CurrentPosition", videoView.getCurrentPosition());
        videoView.pause();
    }



}