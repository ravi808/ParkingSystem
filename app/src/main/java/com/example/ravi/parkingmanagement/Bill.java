package com.example.ravi.parkingmanagement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bill extends Activity {
	
	TextView tv,tv1,tv2;
	 
	 String Slot=null;
	 
	 EditText e1,e2;

	 
	 String h=null;
	  String n=null;
	  String r=null;
	 
	 
	
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bill);
		
		
		tv1=(TextView)findViewById(R.id.textView4);
		tv2=(TextView)findViewById(R.id.textView6);
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.EditText01);
		
		TextView tv=(TextView)findViewById(R.id.textView2);
		Intent i=getIntent();
		
		Slot=i.getStringExtra("a");
		tv.setText(Slot);
		
		
		

		Intent in = getIntent();
		r = in.getStringExtra("r");
		n = in.getStringExtra("n");
		
		
		b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Bill.this,Print.class);
				
				String vn=e1.getText().toString();
				String vm=e2.getText().toString();
				
				
				in.putExtra("vn", vn);
				in.putExtra("vm", vm);
				in.putExtra("Slot", Slot);
				in.putExtra("r", r);
				in.putExtra("n", n);
				
				
				
				startActivity(in);
				
			}
		});
		
		
		
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        //get current date time using java.util.Calender
        Calendar cal = Calendar.getInstance();
        
        //formatting date time
      h=(dateFormat.format(cal.getTime()));
        tv1.setText(h);

        

        Calendar c1 = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat(" h:m:s a");
		sdf1.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		String strdate1 = sdf1.format(c1.getTime());
		
		
		tv2.setText(strdate1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bill, menu);
		return true;
	}

}
