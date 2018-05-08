package com.example.shivani.myalaram;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by SHIVANI on 3/10/2018.
 */

public class AlarmReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        PendingIntent Sender = PendingIntent.getBroadcast(context, 0, intent, 0);
//        NotificationManager manager = (NotificationManager)context.getSystemService(android.content.Context.NOTIFICATION_SERVICE);
//        Notification noti = new Notification(android.R.drawable.stat_notify_more, "Wake up alarm", System.currentTimeMillis());
//        //noti.setLatestEventInfo(context, "My Alarm", "WAKE UP...!!!", Sender);
//        noti.flags = Notification.FLAG_AUTO_CANCEL;
//        manager.notify(R.string.app_name, noti);

//        //intent to call the activity which shows on ringing
//        Intent myIntent = new Intent(context, Alarmring.class);
//        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        context.startActivity(myIntent);
//
//        //display that alarm is ringing
//        Toast.makeText(context, "Alarm Ringing...!!!", Toast.LENGTH_LONG).show();
    }}

