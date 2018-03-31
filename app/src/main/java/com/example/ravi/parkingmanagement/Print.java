package com.example.ravi.parkingmanagement;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.example.ravi.parkingmanagement.quitz.test.db.SQLiteHelper;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Print extends Activity {

	SQLiteHelper sq;
	
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
	
	

	
	String a=null;
	String b=null;
	String c=null;
	  String h=null;
	  String d=null;
	  String f=null;
	  
		String e=null;
		Button b1,b2,b3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_print);
		
		sq=new SQLiteHelper(this);
		
		
		tv1=(TextView)findViewById(R.id.TextView07);
		tv2=(TextView)findViewById(R.id.textView8);
		tv3=(TextView)findViewById(R.id.textView2);
		tv4=(TextView)findViewById(R.id.textView3);
		tv5=(TextView)findViewById(R.id.textView5);
		tv6=(TextView)findViewById(R.id.textView6);
		tv7=(TextView)findViewById(R.id.textView7);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.Button01);
		
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Print.this,Admin.class);
				startActivity(in);
				
			}
		});
		
		
		
		
		Intent i = getIntent();
		a = i.getStringExtra("vn");
		b= i.getStringExtra("vm");
		c= i.getStringExtra("Slot");
		d= i.getStringExtra("r");
		e= i.getStringExtra("n");
		
	
		
		
		
		tv1.setText(a);
		tv2.setText(b);
		tv3.setText(c);
		tv6.setText(e);
		tv7.setText(d);
		
		
		
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        //get current date time using java.util.Calender
        Calendar cal = Calendar.getInstance();
        
        //formatting date time
      h=(dateFormat.format(cal.getTime()));
        tv4.setText(h);

        

        Calendar c1 = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat(" h:m:s a");
		sdf1.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		final String f = sdf1.format(c1.getTime());
		
		
		tv5.setText(f);
		
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				
				String content="Parking Slot  :"+c+"\n"+"Date          :"+h+"\n"+"Vehicle No    :"+a+"\n"+"Time          :"+f+"\n"+"Vehicles Type :"+e+"\n"+"Parking Fare  :"+d+"\n"+"Mobile No     :"+b;
		final String name1=a+"pass";
	

	try { 
	       
	       final String TESTSTRING = new String(content);
           
	       FileOutputStream fOut = openFileOutput(name1,
	                                                            MODE_WORLD_READABLE);
	       OutputStreamWriter osw = new OutputStreamWriter(fOut); 

	       // Write the string to the file
	       osw.write(TESTSTRING);

	       /* ensure that everything is
	        * really written out and close */
	       osw.flush();
	       osw.close();
	   	Log.d(a,"aaaaaaaaaaaaaaaaaaaaaa");
		//int r=sq.insertData2(a, b, c, d, e);
		int r=sq.insertData12(a, b, c, d, e, h, f);

		Toast.makeText(getApplicationContext(), "Values Insertrd",Toast.LENGTH_SHORT).show();
	
	}
	catch (IOException ioe) 
    {
		ioe.printStackTrace();}
    }
	
				
			
		});
		
	/*	b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent (Print.this, Report.class);
				startActivity(in);
				
				
			}
		});  */
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.print, menu);
		return true;
	}

}
