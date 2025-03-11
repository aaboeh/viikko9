package com.example.viikko9;

import java.util.ArrayList;

public class NoteStorage {
    private ArrayList<Note> notes;
    private static NoteStorage noteStorage = null;
    public static NoteStorage getInstance() {
        if (noteStorage == null) {
            noteStorage = new NoteStorage();
        }
        return noteStorage;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note) {
        notes.add(note);
    }
}
