package com.example.sqliteexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class StudentDatabaseHelper extends SQLiteOpenHelper {

    private static final String TABLE ="student1";
    private static final String CREATE_BDD = "CREATE TABLE "+TABLE+" (id TEXT PRIMARY KEY ,name TEXT)";

    private static final String DATABASENAME ="student.db";
    private static final int DATABASEVERSION = 1;

    public StudentDatabaseHelper(Context context){
        super(context, DATABASENAME,null,DATABASEVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("Create", CREATE_BDD+"");
        db.execSQL(CREATE_BDD);
        //ContentValues values = new ContentValues();
        //values.put("name", "john");
       // values.put("name", "mary");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }

    public void onOpen(SQLiteDatabase db){
        super.onOpen(db);
    }
}
