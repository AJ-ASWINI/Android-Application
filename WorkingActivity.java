package com.example.admin.miniproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WorkingActivity extends AppCompatActivity {
  Button b2;
  
  ImageView i1;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 101) {
      Bitmap bitmap = (Bitmap)paramIntent.getExtras().get("data");
      this.i1.setImageBitmap(bitmap);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968605);
    this.i1 = (ImageView)findViewById(2131427420);
    this.b2 = (Button)findViewById(2131427421);
    if (ContextCompat.checkSelfPermission((Context)this, "android.permission.CAMERA") != 0)
      ActivityCompat.requestPermissions((Activity)this, new String[] { "android.permission.CAMERA" }, 101); 
    this.b2.setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            WorkingActivity.this.startActivityForResult(intent, 101);
          }
        });
  }
}
