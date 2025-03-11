package com.example.viikko9;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView noteIdText, noteTimeAndDateText, noteTitleText, noteContentText;
    public NoteViewHolder(View itemView) {
        super(itemView);
        noteIdText = itemView.findViewById(R.id.NoteIdText);
        noteTimeAndDateText = itemView.findViewById(R.id.NoteTimeAndDateText);
        noteTitleText = itemView.findViewById(R.id.NoteTitleText);
        noteContentText = itemView.findViewById(R.id.NoteContentText);
    }
}
