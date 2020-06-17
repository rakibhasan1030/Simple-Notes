package com.rakib.notesmvvmarchitecture;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notes_table")
public class Notes {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private String priority;

    public Notes(String title, String description, String priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
