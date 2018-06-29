package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PetDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();

    private static final String DATABASE_NAME = "shelter.db";
    private static final int DATABASE_VERSION = 1;
    private static final String SQL_CREATE_PETS_TABLE = "CREATE TABLE " +
            PetContract.PetEntry.TABLE_NAME + " (" +
            PetContract.PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            PetContract.PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
            PetContract.PetEntry.COLUMN_PET_BREED + " TEXT NOT NULL, " +
            PetContract.PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL DEFAULT 0, " +
            PetContract.PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0" + ");";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Execute the SQL statement
       sqLiteDatabase.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
