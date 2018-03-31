package com.example.ravi.parkingmanagement;


import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Status extends Activity {
	
	SQLiteHelper sq;
	TextView tv,tv1,tv2,tv3,tv4,tv5,tv6;
	EditText sl;
	Button b1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_status);
		
		sq=new SQLiteHelper(this);
		
Intent i=getIntent();
		
		
		String r = i.getStringExtra("d");
		TextView tv=(TextView)findViewById(R.id.textView1);
		tv.setText(r);
		
		
		b1=(Button)findViewById(R.id.button1);
		tv1=(TextView)findViewById(R.id.textView2);
		tv2=(TextView)findViewById(R.id.TextView01);
		tv3=(TextView)findViewById(R.id.TextView02);
		tv4=(TextView)findViewById(R.id.TextView03);
		tv5=(TextView)findViewById(R.id.TextView04);
		tv6=(TextView)findViewById(R.id.TextView05);
		
		sl=(EditText)findViewById(R.id.editText1);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String slot=sl.getText().toString();
				String slot1=sl.getText().toString();
				String slot2=sl.getText().toString();
				String slot3=sl.getText().toString();
				String slot4=sl.getText().toString();
				String slot5=sl.getText().toString();
				
				
				
				String  r6=sq.getkey6(slot);
				String  r7=sq.getkey7(slot1);
				String  r8=sq.getkey8(slot2);
				String  r9=sq.getkey9(slot3);
				String  r101=sq.getkey15(slot4);
				String  r111=sq.getkey14(slot5);
				
				
				tv1.setText(r6);
				tv2.setText(r7);
				tv3.setText(r8);
				tv4.setText(r9);
				tv5.setText(r101);
				tv6.setText(r111);
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.status, menu);
		return true;
	}

}
