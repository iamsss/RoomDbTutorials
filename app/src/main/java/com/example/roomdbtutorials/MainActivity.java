package com.example.roomdbtutorials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.roomdbtutorials.Adapters.NoteAdapter;
import com.example.roomdbtutorials.notedb.models.Note;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recylerView);
        ArrayList<Note> list = new ArrayList<>();
        list.add(new Note(1,"My First Note","This is description of my first note"));
        list.add(new Note(2,"Test Note","This is description of my second note"));
        list.add(new Note(3,"Third Note","This is description of my third note"));
        list.add(new Note(4,"Fourth Note","This is description of my fourth note"));
        list.add(new Note(5,"Fifth Note","This is description of my fifth note"));
        NoteAdapter adapter = new NoteAdapter(list,this);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
    }
}
