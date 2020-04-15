package com.example.listviewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ContactModel> contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList<>();
        contacts.add(new ContactModel("Codeforces", "8:33 PM", "Codeforces sponsored by Telegram\n" +
                "Hello, Gee1"));
        contacts.add(new ContactModel("CS50's Introduction.","10:02 AM","Keep up the momentum!\n" +
                "Many edX learners in CS50's Introduction to Artificial Intelligence with Python are completing more problems every week, "));
        contacts.add(new ContactModel("Team from Kaggle", "1:49PM","Hi @hathanh8aaa,\n" +
                "The primary goal of Kaggle’s COVID-19 effort is to find factors that impact the transmission of COVID-19" ));
        contacts.add(new ContactModel("Villa", "2:05 AM", "Hi, Can we have a conversation?"));
        contacts.add(new ContactModel("Eden Hazard", "9:12 AM", "I will send your ticket soon!"));
        contacts.add(new ContactModel("FPT Telecom", "6:14 PM", "Your internet bill is out of date."));
        contacts.add(new ContactModel("Dropbox Paper", "1:00 AM", "Create and edit in real time: Invite your team to collaborate in Paper. Edits appear instantly and changes are saved so you can always go back to previous versions."));
        contacts.add(new ContactModel("Fahasa", "8:00 PM", "Your order is transporting. Please wait for about 2 - 3 days more"));
        contacts.add(new ContactModel("Sherlock H", "1:05 AM", "Never mind !"));
        contacts.add(new ContactModel("Facebook", "12:19 PM", "We miss you, G1!. Just come and see what are your friend talking about?"));

        ContactAdapter adapter = new ContactAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
