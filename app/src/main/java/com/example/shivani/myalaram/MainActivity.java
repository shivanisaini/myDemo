package com.example.shivani.myalaram;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent AlarmIntent = new Intent(MainActivity.this, AlarmReciever.class);
        AlarmManager AlmMgr = (AlarmManager)getSystemService(ALARM_SERVICE);
        PendingIntent Sender = PendingIntent.getBroadcast(MainActivity.this, 0, AlarmIntent, 0);
      //  AlmMgr.set(AlarmManager.RTC_WAKEUP, Alarm.getTimeInMillis(), Sender);
    }
}
