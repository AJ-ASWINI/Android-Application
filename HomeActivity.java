package com.example.admin.miniproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Homeactivity extends AppCompatActivity {
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968604);
    (new Handler()).postDelayed(new Runnable() {
          public void run() {
            Intent intent = new Intent((Context)Homeactivity.this, DashboardActivity.class);
            Homeactivity.this.startActivity(intent);
          }
        }10000L);
  }
}
