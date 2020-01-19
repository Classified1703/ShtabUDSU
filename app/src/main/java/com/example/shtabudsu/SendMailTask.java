package com.example.shtabudsu;

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.List;

public class SendMailTask extends AsyncTask {

    private Fragment FirstFragment;

    public SendMailTask(Fragment fragment) {
        FirstFragment = fragment;

    }


    @Override
    protected Object doInBackground(Object... args) {
        try {
            GMail androidEmail = new GMail(args[0].toString(),
                    args[1].toString(), (List) args[2], args[3].toString(),
                    args[4].toString());

            androidEmail.createEmailMessage();
            androidEmail.sendEmail();
        } catch (Exception e) {
            Log.e("SendMailTask", e.getMessage(), e);
        }
        return null;
    }

}