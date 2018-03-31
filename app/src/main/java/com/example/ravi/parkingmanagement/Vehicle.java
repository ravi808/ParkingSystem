package com.example.ravi.parkingmanagement;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Vehicle extends Activity {
	
	
	Button b1,b2;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vehicle);
		

		Intent i1 = getIntent();
		
		
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.Button01);
		
b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				Intent in=new Intent(Vehicle.this,Car.class);
				
				in.putExtra("g", "30");
			 	in.putExtra("t", "Car"); 
				
				startActivity(in);
				
			}
		});
		
		b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				Intent in=new Intent(Vehicle.this,Bike.class);
				
				in.putExtra("g", "20");
			 	in.putExtra("t", "Bike"); 
				startActivity(in);
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vehicle, menu);
		return true;
	}

}
