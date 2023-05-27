package com.sarathchandraProjects.springMVCFormTags.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sarathchandraProjects.springMVCFormTags.Model.Note;

@Repository
public class NoteDaoImpl implements NoteDao {
	
	ArrayList<Note> noteList = new ArrayList<>();

	@Override
	public void save(Note note) {
		noteList.add(note);
		System.out.println("Note is added to the list succesfully");
	}

	@Override
	public List<Note> findAllNotes() {
		return noteList;
	}

}
