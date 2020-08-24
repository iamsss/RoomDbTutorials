package com.example.roomdbtutorials.notedb;

import androidx.room.RoomDatabase;

import com.example.roomdbtutorials.notedb.dao.NoteDao;

public abstract class NoteDatabase extends RoomDatabase {
    public abstract NoteDao getNoteDao();
}
