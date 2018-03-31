package com.example.ravi.parkingmanagement.quitz.test.db;

import java.util.ArrayList;
import java.util.List;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLiteHelper {

	public static ArrayList<String[]> DATA = new ArrayList<String[]>();
	private static final String DATABASE_NAME = "friendmapper.db";
	private static final int DATABASE_VERSION = 1;
	private static final String STUDENT_TABLE = "friend";
	private static final String STUDENT_TABLE8 = "msgtable";

	private Context context;
	private SQLiteDatabase db = null;
	OpenHelper openHelper;

	String name = null;
	String msg = null;
	String name1=null;

	public SQLiteHelper(Context context) {
		this.context = context;

		if (db != null)
			if (db.isOpen())
				db.close();

		openHelper = new OpenHelper(this.context);
		this.db = openHelper.getWritableDatabase();
	}

	public void close() {
		if (openHelper != null) {
			openHelper.close();
		}
	}

	public int insertData(String name, String un, String pw, String em,
			String mn) {
		int entryId = 0;
		ContentValues values = new ContentValues();
		values.put("name", name);
		values.put("un", un);
		values.put("pw", pw);
		values.put("em", em);
		values.put("mn", mn);
		
		

		entryId = (int) this.db.insert(STUDENT_TABLE, null, values);
		return entryId;
	}

	public ArrayList<String[]> selectdatabase(String search) {
		Cursor c = null;
		DATA.clear();
		String[] columns = new String[] { "seat" };
		c = db.query(STUDENT_TABLE8, columns, "travels=", new String[] {
				search, search, search }, null, null, "id DESC");
		if (c.moveToFirst()) {
			do {
				if (c.getColumnCount() == 2) {
					String[] str = new String[3];
					str[0] = c.getString(1);
					str[1] = c.getString(2);
					str[2] = c.getString(3);
					DATA.add(str);
				}
			} while (c.moveToNext());
		}

		if (c != null && !c.isClosed()) {
			c.close();
		}
		return DATA;
	}

	public void cr(String k, String k1) {
		ContentValues values = new ContentValues();
		values.put("cn1", k);

		int id = db
				.update(STUDENT_TABLE, values, "name=?", new String[] { k1 });

	}

	public String loginData(String h, String h1) {

		Cursor c1 = null;
		DATA.clear();
		String[] columns = new String[] { "name", "pw" };

		c1 = db.query(STUDENT_TABLE, columns, "name=? AND pw=?  ",
				new String[] { h, h1 }, null, null, null);
		if (c1.moveToNext()) {

			String n = c1.getString(0);
			return "ok";

		} else {
			return "no";
		}
	}

	public int insertData12(String vn, String mn, String slot, String pf, String vt, String dt, String tm) {

		int entryId = 0;
		ContentValues values = new ContentValues();
		values.put("vn", vn);
		values.put("mn", mn);
		values.put("slot", slot);
		values.put("pf", pf);
		values.put("vt", vt);
		values.put("dt", dt);
		values.put("tm", tm);

		entryId = (int) this.db.insert(STUDENT_TABLE8, null, values);
		return entryId;

	}
	
	public String getkey(String vn) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "mn" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"vn=?", new String[] {vn}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	public String getkey1(String loca1) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "slot" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"vn=?", new String[] {loca1}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	
	
	public String getkey2(String loca2) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "pf" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"vn=?", new String[] {loca2}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	
	public String getkey3(String loca3) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "vt" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"vn=?", new String[] {loca3}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	
	public String getkey4(String loca4) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "dt" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"vn=?", new String[] {loca4}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}

	

	public String getkey5(String loca5) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "tm" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"vn=?", new String[] {loca5}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	} 
	
	
	public String getkey6(String slot) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		//Log.d(slot,"00000000000000000000");
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "vn" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"slot=?", new String[] {slot}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	
	public String getkey7(String slot1) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		//Log.d(slot,"00000000000000000000");
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "mn" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"slot=?", new String[] {slot1}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}

	
	public String getkey8(String slot2) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		//Log.d(slot,"00000000000000000000");
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "pf" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"slot=?", new String[] {slot2}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	
	public String getkey9(String slot3) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		//Log.d(slot,"00000000000000000000");
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "vt" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"slot=?", new String[] {slot3}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	
	public String getkey15(String slot4) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		//Log.d(slot,"00000000000000000000");
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "dt" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"slot=?", new String[] {slot4}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}
	
	
	public String getkey14(String slot5) 
	{
		// TODO Auto-generated method stub
		Cursor c1 = null;
		
		//Log.d(slot,"00000000000000000000");
		
		String n2=null;
		
		DATA.clear();
		String[] columns = new String[] {  "tm" };
		
		c1 = db.query(STUDENT_TABLE8, columns,"slot=?", new String[] {slot5}, null,null,null);
		
		
		if (c1.moveToNext()) {
		
		 n2=c1.getString(0);
		 
		Log.d(n2,"00000000000000000000");
		}
		return n2;
	}














	static class OpenHelper extends SQLiteOpenHelper {

		OpenHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {

			db.execSQL("CREATE TABLE " + STUDENT_TABLE + "("
					+ "ke INTEGER PRIMARY KEY," + "name TEXT, " + "un TEXT,"
					+ "pw TEXT," + "em TEXT," + "mn TEXT)");

			db.execSQL("CREATE TABLE " + STUDENT_TABLE8 + "("+ "ke INTEGER PRIMARY KEY," + "vn TEXT, "
					+ "mn TEXT," + "slot TEXT, "
					+ "pf TEXT," + "vt TEXT, "
					+ "dt TEXT," + "tm TEXT)");

		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			Log.w("Catch DB",
					"Upgrading database, this will drop tables and recreate.");
			db.execSQL("DROP TABLE IF EXISTS " + STUDENT_TABLE);

			Log.w("Catch DB",
					"Upgrading database, this will drop tables and recreate.");
			db.execSQL("DROP TABLE IF EXISTS " + STUDENT_TABLE8);

			onCreate(db);
		}
	}

	public Cursor getAllContacts() {
		// TODO Auto-generated method stub

		return db.query(STUDENT_TABLE8, new String[] { name, msg, name1 }, null, null,
				null, null, null);
		// return null;
	}

	public Cursor rawQuery(String string , Object object) {

		return null;
	}

	public String getkey10(String slot4) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getkey11(String slot5) {
		// TODO Auto-generated method stub
		return null;
	}

}
