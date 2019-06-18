package com.example.celinenotepad.database;

public class Note {
    private  int id;
    private String noteText;
    private String title;

    public Note(String noteText, String title) {
        this.noteText = noteText;
        this.title = title;
    }

    public Note(int id, String noteText, String title) {

        this.id = id;
        this.noteText = noteText;
        this.title = title;
    }

    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
