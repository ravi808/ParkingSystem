package com.example.ravi.parkingmanagement.quitz.test.db;


import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
 
public class DBAdapter1 {
	public static final String KEY_ROWID = "vn";
	public static final String KEY_NAME = "mn";
	//public static final String KEY_EMAIL = "email";
	private static final String TAG = "DBAdapter";
	private static final String DATABASE_NAME = "friendmapper.db";
	private static final String DATABASE_TABLE = "msgtable";
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_CREATE =
			"create table contacts (_id integer primary key autoincrement, "
					+ "vn text not null, mn text not null);";
	private final Context context;
	private DatabaseHelper DBHelper;
	private SQLiteDatabase db;
	
	public DBAdapter1(Context ctx)
	{
		this.context = ctx;
		DBHelper = new DatabaseHelper(context);
	}
	
	private static class DatabaseHelper extends SQLiteOpenHelper
	{
		DatabaseHelper(Context context)
		{
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		
		@Override
		public void onCreate(SQLiteDatabase db)
		{
			try {
				db.execSQL(DATABASE_CREATE);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
		{
			Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
					+ newVersion + ", which will destroy all old data");
			db.execSQL("DROP TABLE IF EXISTS contacts");
			onCreate(db);
		}
	}
	
	
	//---opens the database---
	public DBAdapter1 open() throws SQLException
	{
		db = DBHelper.getWritableDatabase();
		return this;
	}
	
	
	//---closes the database---
	public void close()
	{
		DBHelper.close();
	}
	
	
	
	
	
	//---retrieves all the contacts---
	public Cursor getAllContacts()
	{
		return db.query(DATABASE_TABLE, new String[] {KEY_ROWID, KEY_NAME}, 
				null, null, null, null, null);
	}
	
	
	
}
