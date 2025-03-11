package com.example.viikko9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
    }

    public void addNote(View view) {
        Button addNoteButton = findViewById(R.id.AddNoteButton);
        EditText titleEdit = findViewById(R.id.TitleEdit);
        EditText contentEdit = findViewById(R.id.ContentEdit);

        String title = titleEdit.getText().toString();
        String content = contentEdit.getText().toString();

        NoteStorage.getInstance().addNote(new Note(title, content));
    }
}
