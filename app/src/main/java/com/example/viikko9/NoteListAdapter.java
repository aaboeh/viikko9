package com.example.viikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteListAdapter extends RecyclerView.Adapter<NoteViewHolder> {
    private Context context;
    private ArrayList<Note> notes = new ArrayList<>();

    public NoteListAdapter(Context context, ArrayList<Note> notes) {
        this.context = context;
        this.notes = notes;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NoteViewHolder(LayoutInflater.from(context).inflate(R.layout.note_view_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.noteIdText.setText(String.valueOf(notes.get(position).getId()));
        holder.noteTimeAndDateText.setText(notes.get(position).getTimeAndDate());
        holder.noteTitleText.setText(notes.get(position).getTitle());
        holder.noteContentText.setText(notes.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
