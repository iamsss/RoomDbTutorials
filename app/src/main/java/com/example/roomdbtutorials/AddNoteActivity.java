package com.example.roomdbtutorials;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddNoteActivity extends AppCompatActivity {

    TextView addTitle;
    TextView addDescription;
    Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        addTitle = findViewById(R.id.addText);
        addDescription = findViewById(R.id.addDescription);
        saveBtn = findViewById(R.id.button_save);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = String.valueOf(addTitle.getText());
                String description = String.valueOf(addDescription.getText());
                if(!title.isEmpty() && !description.isEmpty()){
                    Toast.makeText(AddNoteActivity.this,title, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AddNoteActivity.this,"Please fill all value", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
        {
            String dynamicTitle = "Add Note";
            //Setting a dynamic title at runtime. Here, it displays the current time.
            actionBar.setTitle(dynamicTitle);
        }
    }
}
