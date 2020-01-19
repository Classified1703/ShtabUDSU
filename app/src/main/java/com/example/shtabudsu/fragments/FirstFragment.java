package com.example.shtabudsu.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.shtabudsu.GMail;
import com.example.shtabudsu.R;

import java.util.Arrays;
import java.util.List;

public class FirstFragment extends Fragment {
    Button send;
    private EditText name;
    private EditText phone;
    private EditText vk;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_first, container, false);


        name = (EditText) view.findViewById(R.id.name);
        phone = (EditText) view.findViewById(R.id.phone);
        vk = (EditText) view.findViewById(R.id.http_vk);

        final String send_name = name.getText().toString();
        final String send_phone = phone.getText().toString();
        final String send_vk = vk.getText().toString();

        final String message = send_name + "\n" + send_phone + "\n" + send_vk + "\n";

        send = view.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fromEmail = "stabudsu@gmail.com";
                String fromPassword = "squadudsu";
                String toEmails = "stabudsu@gmail.com";
                String emailSubject = "Кандидат Приложение";
                List toEmailList = Arrays.asList(toEmails
                        .split("\\s*,\\s*"));
                String emailBody = message;
                try {
                    GMail androidEmail = new GMail(fromEmail,
                            fromPassword, toEmailList, emailSubject,
                            emailBody);

                    androidEmail.createEmailMessage();
                    androidEmail.sendEmail();
                } catch (Exception e) {
                    Log.e("SendMailTask", e.getMessage(), e);
                }
            }
        });
        return view;

    }
    }