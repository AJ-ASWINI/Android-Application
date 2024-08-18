package com.example.admin.sda3miniproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
  Button b1;
  
  EditText e1;
  
  EditText e2;
  
  String password;
  
  String uname;
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968603);
    this.e1 = (EditText)findViewById(2131427415);
    this.e2 = (EditText)findViewById(2131427416);
    this.b1 = (Button)findViewById(2131427417);
    this.b1.setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            DashboardActivity.this.uname = DashboardActivity.this.e1.getText().toString();
            DashboardActivity.this.password = DashboardActivity.this.e2.getText().toString();
            if (DashboardActivity.this.uname.equals("") && DashboardActivity.this.password.equals("")) {
              Toast.makeText(DashboardActivity.this.getApplicationContext(), "Valid user", 1).show();
              Intent intent = new Intent((Context)DashboardActivity.this, WorkingActivity.class);
              DashboardActivity.this.startActivity(intent);
              return;
            } 
            if (DashboardActivity.this.uname.isEmpty() || DashboardActivity.this.password.isEmpty()) {
              Toast.makeText(DashboardActivity.this.getApplicationContext(), "Please Fill All the Fields", 1).show();
              return;
            } 
            Toast.makeText(DashboardActivity.this.getApplicationContext(), "InValid user", 1).show();
          }
        });
  }
}
