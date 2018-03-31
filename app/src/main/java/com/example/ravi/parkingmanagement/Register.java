package com.example.ravi.parkingmanagement;


import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends Activity {
	
	
	SQLiteHelper sq;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		
		sq=new SQLiteHelper(this);

		final EditText e1=(EditText)findViewById(R.id.editText1);
		final EditText e2=(EditText)findViewById(R.id.EditText01);
		final EditText e3=(EditText)findViewById(R.id.editText2);
		final EditText e4=(EditText)findViewById(R.id.editText3);
		final EditText e5=(EditText)findViewById(R.id.editText4);
		
		
		Button b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String name=e1.getText().toString();
				String un=e2.getText().toString();
				String pw=e3.getText().toString();
				String em=e4.getText().toString();
				String mn=e5.getText().toString();
				
				
				int r=sq.insertData(name, un, pw, em, mn);
				Intent i=new Intent(Register.this,Login.class);
				startActivity(i);
				
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
