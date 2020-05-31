package com.example.user.couming; 

import android.content.Intent; 
import android.support.v7.app.AppCompatActivity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 

//import com.gc.materialdesign.views.ButtonRectangle; 11 

public class IntentActivity extends AppCompatActivity { 
private EditText txtinputmsg; 
private Button btnsendexplicit,btnsource; 
Button btnemailimplicit; 

@Override 
protected void onCreate(Bundle savedInstanceState)
super.onCreate(savedInstanceState);  setContentView(R.layout.activity_intent); 
txtinputmsg = (EditText) findViewById(R.id.txtinput); 
btnsendexplicit = (Button) findViewById(R.id.btnsendExplicit);
btnemailimplicit = (Button) findViewById(R.id.btnemailimplicit); 
btnsource = (Button) findViewById(R.id.btnsource); 
btnsendexplicit.setOnClickListener(new View.OnClickListener() {
    	  @Override 
          public void onClick(View view) { 
           String mesaage = txtinputmsg.getText().toString();
            Intent intent = new Intent(IntentActivity.this,IntentSecond.class); 31      intent.putExtra("4129",mesaage); 
    	      startActivity(intent); 
    	      } 
    	    }  ); 
    	    
    	    btnemailimplicit.setOnClickListener(new View.OnClickListener() { 
    	    @Override 
    	    public void onClick(View view) { 
    	            String mesaage = txtinputmsg.getText().toString();
    	            Intent intent11 = new Intent(Intent.ACTION_SEND); 
    	            intent11.putExtra(Intent.EXTRA_TEXT,mesaage); 
    	            intent11.setType("text/plain"); 
    	            intent11.setPackage("com.google.android.gm"); 
    	             startActivity(intent11); 
    	             } 
    	         }); 
    	       }
    	     } 
