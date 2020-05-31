package com.example.user.couming;

import android.content.Intent; 
import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle; 
import android.widget.TextView; 

public class IntentSecond extends AppCompatActivity {
	 private TextView showtxtmsg; 
	
	
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	 	 super.onCreate(savedInstanceState);
	 	 setContentView(R.layout.activity_intent_second); 
	 	 showtxtmsg = (TextView) findViewById(R.id.showtxtmsg);
	 	 Intent intent1 = getIntent(); 
	 	 String getmsg = intent1.getStringExtra("4129") ;
	 	 showtxtmsg.setText(getmsg); 
	     } 
	  }
	  
