package com.example.shtabudsu.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.shtabudsu.R;

import java.util.concurrent.TimeUnit;

import static com.example.shtabudsu.R.raw.arifmetika;
import static com.example.shtabudsu.R.raw.brat;
import static com.example.shtabudsu.R.raw.druz;
import static com.example.shtabudsu.R.raw.dvij;
import static com.example.shtabudsu.R.raw.lanselot;
import static com.example.shtabudsu.R.raw.my;
import static com.example.shtabudsu.R.raw.pegas;
import static com.example.shtabudsu.R.raw.poezdataya;
import static com.example.shtabudsu.R.raw.proidi;
import static com.example.shtabudsu.R.raw.sila;
import static com.example.shtabudsu.R.raw.skif;
import static com.example.shtabudsu.R.raw.snova;
import static com.example.shtabudsu.R.raw.strana;
import static com.example.shtabudsu.R.raw.tovar;
import static com.example.shtabudsu.R.raw.visota;
import static com.example.shtabudsu.R.raw.zaberi;
import static com.example.shtabudsu.R.raw.zelen;

public class OtherFragment extends Fragment {
    Button play, pause, dorewind, fastforward,
            music1, music2, music3, music4, music5, music6, music7, music8, music9,
            music10, music11, music12, music13, music14, music15, music16, music17;
    TextView text;
    String nameTrack;
    private SeekBar seekBar;
    private MediaPlayer mediaPlayer;
    private Handler threadHandler = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_other, container, false);

        play = view.findViewById(R.id.play);
        pause = view.findViewById(R.id.pause);
        //stop = view.findViewById(R.id.stop);
        dorewind = view.findViewById(R.id.doRewind);
        fastforward = view.findViewById(R.id.fastforward);
        text = view.findViewById(R.id.textView4);

        //Музыка
        music1 = view.findViewById(R.id.button2);
        music2 = view.findViewById(R.id.button3);
        music3 = view.findViewById(R.id.button4);
        music4 = view.findViewById(R.id.button5);
        music5 = view.findViewById(R.id.button6);
        music6 = view.findViewById(R.id.button7);
        music7 = view.findViewById(R.id.button8);
        music8 = view.findViewById(R.id.button9);
        music9 = view.findViewById(R.id.button10);
        music10 = view.findViewById(R.id.button11);
        music11 = view.findViewById(R.id.button12);
        music12 = view.findViewById(R.id.button13);
        music13 = view.findViewById(R.id.button14);
        music14 = view.findViewById(R.id.button15);
        music15 = view.findViewById(R.id.button16);
        music16 = view.findViewById(R.id.button17);
        music17 = view.findViewById(R.id.button18);

        text.setText("Выберете трек");

        seekBar = (SeekBar) view.findViewById(R.id.seekBar);
        seekBar.setClickable(false);

        //
        //
        //final MediaPlayer mediaPlayer;
        mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), snova);
        play.setEnabled(false);
        pause.setEnabled(false);
        //stop.setEnabled(false);
        dorewind.setEnabled(false);
        fastforward.setEnabled(false);

        music1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), snova);
                nameTrack = "Оля Шевченко - Снова в отряд (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });

        music2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), proidi);
                nameTrack = "ССО Д.Э.М.С. - Пройди этот путь (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });

        music3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), zelen);
                nameTrack = "ССО Вега - Куртки зеленые (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });

        music4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), brat);
                nameTrack = "ССО Приморец - Эй Брат (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), poezdataya);
                nameTrack = "ССО Д.Э.М.С. - Поездатая (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), sila);
                nameTrack = "СПО Драйв - Издалека заметишь нас (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), zaberi);
                nameTrack = "Оля Шевченко - Забери меня (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), arifmetika);
                nameTrack = "ЛСО Просвет - Арифметика отряда (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), visota);
                nameTrack = "ССО Высота - Три слова и точка (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), lanselot);
                nameTrack = "СОП Ланселот - Без чудес нельзя (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), strana);
                nameTrack = "Колупаева, Коротаева - Здравствуй страна (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), dvij);
                nameTrack = "Артем Колобов - Мы лучшее движение (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), pegas);
                nameTrack = "СОП Пегас - Музыка в стучании колес (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), my);
                nameTrack = "СОП Эдельвейс - Моя целина (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), tovar);
                nameTrack = "ССО Товарищ - Мы друг друга узнаем не по значкам (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), druz);
                nameTrack = "СПО Друзья - Твоя целина (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        music17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
                mediaPlayer = (MediaPlayer) MediaPlayer.create(getActivity(), skif);
                nameTrack = "ССО Скиф - Сочи-Питер, на Восток (";
                play.setEnabled(true);
                pause.setEnabled(true);
                dorewind.setEnabled(true);
                fastforward.setEnabled(true);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = mediaPlayer.getDuration();

                int currentPosition = mediaPlayer.getCurrentPosition();
                if(currentPosition == 0){
                    seekBar.setMax(duration);
                } else if(currentPosition == duration){
                    // Сбрасывает медиаплеер в неинициализированное состояние.
                    mediaPlayer.reset();
                }
                mediaPlayer.start();
                // Создайте поток для обновления позиции SeekBar.
                UpdateSeekBarThread updateSeekBarThread= new UpdateSeekBarThread();
                threadHandler.postDelayed(updateSeekBarThread,50);

                pause.setEnabled(true);
                play.setEnabled(false);
                //stop.setEnabled(true);
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    play.setEnabled(true);
                    pause.setEnabled(false);
                    //stop.setEnabled(true);

                }
            }
        });
        /*stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.setEnabled(true);
                pause.setEnabled(false);
               // stop.setEnabled(false);
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();

            }
        });*/
        fastforward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = mediaPlayer.getCurrentPosition();
                int duration = mediaPlayer.getDuration();
                // 5 seconds.
                int ADD_TIME = 5000;

                if(currentPosition + ADD_TIME < duration)  {
                    mediaPlayer.seekTo(currentPosition + ADD_TIME);
                }
            }
        });
        dorewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentPosition = mediaPlayer.getCurrentPosition();
                int duration = mediaPlayer.getDuration();
                // 5 seconds.
                int SUBTRACT_TIME = 5000;

                if(currentPosition - SUBTRACT_TIME > 0 )  {
                    mediaPlayer.seekTo(currentPosition - SUBTRACT_TIME);
                }
            }
        });
        return view;
    }
    public String millisecondsToString(int milliseconds)  {
        long minutes = TimeUnit.MILLISECONDS.toMinutes((long) milliseconds);
        long seconds =  (TimeUnit.MILLISECONDS.toSeconds((long) milliseconds) > 60)?(TimeUnit.MILLISECONDS.toSeconds((long) milliseconds) - 60):(TimeUnit.MILLISECONDS.toSeconds((long) milliseconds)) ;
        return minutes+":"+ seconds;
    }
    // Поток для обновления позиции для SeekBar.
    class UpdateSeekBarThread implements Runnable{
        public void run(){
            int currentPosition = mediaPlayer.getCurrentPosition();
            String currentPositionStr = millisecondsToString(currentPosition);
            text.setText(nameTrack + currentPositionStr + ")");
            seekBar.setProgress(currentPosition);
            threadHandler.postDelayed(this,50);
        }
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying()) {
            play.setEnabled(true);
            pause.setEnabled(false);
            // stop.setEnabled(false);
            mediaPlayer.seekTo(0);
            mediaPlayer.stop();
        }
    }



}
