package com.example.roomdbtutorials.notedb.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.roomdbtutorials.notedb.models.Note;
import com.example.roomdbtutorials.utils.Util;
import java.util.List;


@Dao
public interface NoteDao {
    @Query("SELECT * FROM "+ Util.TABLE_NAME_NOTE)
    List<Note> getAll();


    /*
     * Insert the object in database
     * @param note, object to be inserted
     */
    @Insert
    void insert(Note note);

    /*
     * update the object in database
     * @param note, object to be updated
     */
    @Update
    void update(Note repos);

    /*
     * delete the object from database
     * @param note, object to be deleted
     */
    @Delete
    void delete(Note note);

    /*
     * delete list of objects from database
     * @param note, array of objects to be deleted
     */
    @Delete
    void delete(Note... note);      // Note... is varargs, here note is an array

}
