package com.rakib.notesmvvmarchitecture;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface NoteDao {

    @Insert
    void insert(Notes notes);

    @Update
    void update(Notes notes);

    @Delete
    void delete(Notes notes);

    @Query("DELETE FROM notes_table")
    void deleteAllNotes();

    @Query("SELECT * FROM notes_table ORDER BY priority DESC")
    LiveData<List<Notes>>getAllNotes();


}
