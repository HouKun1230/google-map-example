package com.example.kunhou.mapofcontacts;

import android.app.Activity; 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button;
import android.widget.EditText; 
import android.widget.RadioButton;

import com.example.kunhou.mapofcontacts.R;

public class MainActivity extends Activity
{ 
  /** Called when the activity is first created. */ 
  @Override
  public void onCreate(Bundle savedInstanceState)
  { 
    super.onCreate(savedInstanceState); 
    
    setContentView(R.layout.activity_main);
   
    Button b1 = (Button) findViewById(R.id.button1);
    Button b2 = (Button) findViewById(R.id.button2);
    Button b3 = (Button) findViewById(R.id.button3);
    Button b4 = (Button) findViewById(R.id.button4);
    Button b5 = (Button) findViewById(R.id.button5);
   
    b1.setOnClickListener(new Button.OnClickListener() 
    {
      public void onClick(View v) 
      {
       

        double x = 48.420892;
        double y = -89.260566;
        String name = "DAN";

        Intent intent = new Intent(); 
        intent.setClass(MainActivity.this,MapsActivity.class); 

        Bundle bundle = new Bundle();
        bundle.putDouble("x",x);
        bundle.putDouble("y",y); 
        bundle.putString("name",name);

        intent.putExtras(bundle); 

        startActivity(intent); 
        } 
      }); 
    
    b2.setOnClickListener(new Button.OnClickListener() 
    {
      public void onClick(View v) 
      {
       

        double x = 48.420990;
        double y = -89.250238;
        String name = "John";

        Intent intent = new Intent(); 
        intent.setClass(MainActivity.this,MapsActivity.class); 

        Bundle bundle = new Bundle();
        bundle.putDouble("x",x);
        bundle.putDouble("y",y); 
        bundle.putString("name", name);

        intent.putExtras(bundle); 

        startActivity(intent); 
        } 
      }); 
    
    b3.setOnClickListener(new Button.OnClickListener() 
    {
      public void onClick(View v) 
      {
       

        double x = 43.516144;
        double y = -80.512254;
        String name = "Daniel";

        Intent intent = new Intent(); 
        intent.setClass(MainActivity.this,MapsActivity.class); 

        Bundle bundle = new Bundle();
        bundle.putDouble("x",x);
        bundle.putDouble("y",y); 
        bundle.putString("name", name);

        intent.putExtras(bundle); 

        startActivity(intent); 
        } 
      }); 
    
    b4.setOnClickListener(new Button.OnClickListener() 
    {
      public void onClick(View v) 
      {
       

        double x = 48.376485;
        double y = -89.319674;
        String name = "Johnny";

        Intent intent = new Intent(); 
        intent.setClass(MainActivity.this,MapsActivity.class); 

        Bundle bundle = new Bundle();
        bundle.putDouble("x",x);
        bundle.putDouble("y",y); 
        bundle.putString("name", name);

        intent.putExtras(bundle); 

        startActivity(intent); 
        } 
      }); 
    
    b5.setOnClickListener(new Button.OnClickListener() 
    {
      public void onClick(View v) 
      {
       

        double x = 48.413501;
        double y = -89.243799;
        String name = "Makiyo";

        Intent intent = new Intent(); 
        intent.setClass(MainActivity.this,MapsActivity.class); 

        Bundle bundle = new Bundle();
        bundle.putDouble("x",x);
        bundle.putDouble("y",y); 
        bundle.putString("name", name);

        intent.putExtras(bundle); 

        startActivity(intent); 
        } 
      }); 
    }
  }