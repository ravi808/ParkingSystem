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

public class Details extends Activity {
	
	
	SQLiteHelper sq;
	Button b,b1;
	EditText no;
	TextView t1,t2,t3,t4,t5,t6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
		
		
		sq=new SQLiteHelper(this);
		
		b=(Button)findViewById(R.id.button1);
		b1=(Button)findViewById(R.id.button2);
		 no=(EditText) findViewById(R.id.editText1);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.TextView01);
		t3=(TextView)findViewById(R.id.TextView02);
		t4=(TextView)findViewById(R.id.TextView03);
		t5=(TextView)findViewById(R.id.TextView04);
		t6=(TextView)findViewById(R.id.TextView05);
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent in=new Intent(Details.this,Admin.class);
				startActivity(in);
				
			}
		});
				
				b.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						String vn=no.getText().toString();
						String loca1=no.getText().toString();
						String loca2=no.getText().toString();
						String loca3=no.getText().toString();
						String loca4=no.getText().toString();
						String loca5=no.getText().toString();
						
							String  r=sq.getkey(vn);
							String  r1=sq.getkey1(loca1);
							String  r2=sq.getkey2(loca2);
							String  r3=sq.getkey3(loca3);
							String  r4=sq.getkey4(loca4);
							String  r5=sq.getkey5(loca5);
							
							t1.setText(r);
							t2.setText(r1);
							t3.setText(r2);
							t4.setText(r3);
							t5.setText(r4);
							t6.setText(r5);

						
						
						
						
					}
				});
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.details, menu);
		return true;
	}

}
