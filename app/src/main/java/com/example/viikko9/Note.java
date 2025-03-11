package com.example.viikko9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Note {
    private static int noteCounter = 1;
    int Id;
    String title;
    String content;
    String timeAndDate;

    public Note(String title, String content) {
        this.Id = noteCounter++;
        this.title = title;
        this.content = content;
        this.timeAndDate = new SimpleDateFormat("HH:mm dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }
}
