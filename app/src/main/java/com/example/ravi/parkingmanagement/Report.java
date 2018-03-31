package com.example.ravi.parkingmanagement;

import java.util.ArrayList;


import com.quitz.test.db.DBAdapter1;
import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Report extends Activity {
	
	String vn = null;
	String mn = null;
	String slot = null;
	String pf = null;
	String vt = null;
	String dt = null;
	String tm = null;
	
	SQLiteHelper db;
	// TextView tv;
	Button b1, b2;

	ListView listView;
	Adapter adapter;

	ArrayList<String> msgList;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_report);
		
		
		msgList = new ArrayList<String>();

		listView = (ListView) findViewById(R.id.listView);

		db = new SQLiteHelper(this);

		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);

		final DBAdapter1 db = new DBAdapter1(Report.this);

		db.open();
		Cursor c = db.getAllContacts();
		if (c.moveToFirst()) {
			do {
				DisplayContact(c);
			} while (c.moveToNext());
		}
		db.close();

		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				 Intent in = new Intent(Report.this, Veh.class);
				
				 startActivity(in);

			}

		});

		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				adapter = new ArrayAdapter<String>(Report.this,
						android.R.layout.simple_list_item_1, msgList);
				listView.setAdapter((ListAdapter) adapter);

			}
		});

	}

	private void DisplayContact(Cursor c) {
		// TODO Auto-generated method stub

		msgList.add(c.getString(0));

		// Toast.makeText(
		// getBaseContext(),
		// "Name " + c.getString(0) + "\n" + "Msg: "
		// + c.getString(1) + "\n", Toast.LENGTH_LONG)
		// .show();

		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.report, menu);
		return true;
	}

}
