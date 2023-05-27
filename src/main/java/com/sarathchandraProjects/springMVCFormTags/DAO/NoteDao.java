package com.sarathchandraProjects.springMVCFormTags.DAO;

import java.util.List;

import com.sarathchandraProjects.springMVCFormTags.Model.Note;

public interface NoteDao {
	
	public void save(Note note);
	public List<Note> findAllNotes();

}
