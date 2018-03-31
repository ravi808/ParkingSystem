package com.example.ravi.parkingmanagement;



import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity  {

	SQLiteHelper sq;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		

		sq=new SQLiteHelper(this);
		final EditText e1=(EditText)findViewById(R.id.editText1);
		final EditText e2=(EditText)findViewById(R.id.editText2);
		
				
		Button b=(Button)findViewById(R.id.button1);
		Button b1=(Button)findViewById(R.id.Button01);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			
				String n=e1.getText().toString();
				String p=e2.getText().toString();
				
				String m=sq.loginData(n,p);
				
				if(m.equals("ok"))
				{
					Intent in=new Intent(Login.this,Admin.class);

	startActivity(in);

					//Toast.makeText(getApplicationContext(), "Try again1111...",Toast.LENGTH_SHORT).show();
				}
				
				else 
				{
					Toast.makeText(getApplicationContext(), "Try again...",Toast.LENGTH_SHORT).show();
					
				}
			}
		});
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			
				Intent in=new Intent(Login.this,Register.class);
			startActivity(in);
			}
		});
	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	
}
