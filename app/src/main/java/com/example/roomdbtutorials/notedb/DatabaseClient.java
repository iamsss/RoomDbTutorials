package com.example.roomdbtutorials.notedb;

import android.content.Context;

import androidx.room.Room;

import com.example.roomdbtutorials.utils.Util;

public class DatabaseClient {
    private Context mCtx;
    private static DatabaseClient mInstance;

    //our app database object
    private NoteDatabase appDatabase;

    private DatabaseClient(Context mCtx) {
        this.mCtx = mCtx;
        //creating the app database with Room database builder
        //MyToDos is the name of the database
        appDatabase = Room.databaseBuilder(mCtx, NoteDatabase.class, Util.DATABASE_NAME).build();
    }

    public static synchronized DatabaseClient getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new DatabaseClient(mCtx);
        }
        return mInstance;
    }

    public NoteDatabase getAppDatabase() {
        return appDatabase;
    }
}