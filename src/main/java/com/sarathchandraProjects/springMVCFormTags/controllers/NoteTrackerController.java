package com.sarathchandraProjects.springMVCFormTags.controllers;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sarathchandraProjects.springMVCFormTags.DAO.NoteDao;
import com.sarathchandraProjects.springMVCFormTags.Model.Note;

@Controller
public class NoteTrackerController {
	
	@Autowired
	NoteDao noteDao;
	
	@RequestMapping("/note-home-page")
	public String noteHomePage( @ModelAttribute("note")   String note,
			                    @ModelAttribute("desc") String desc)  
	{
		return "note-home-page";
	}
	
	
	@RequestMapping("/submit-home-page")
	public String saveNote(@ModelAttribute("note") String noteName,
			               @ModelAttribute("desc") String noteDesc) 
	{ 
		return "submit-home-page";
	}

	@RequestMapping("/note-home-page2")
	public String noteHomePage2(@ModelAttribute("noteObj") Note note)
	{		
		return "note-home-page2";
	}
	
	  @RequestMapping("/submit-home-page2") 
	  public String saveNote2(@ModelAttribute("noteObj") Note note) 
	  { 
		  return "submit-home-page2";
	  }
	  
	@RequestMapping("/note-home-page-using-MVC-FormTags")
	public String noteHomePageUsingMVCFormTags(@ModelAttribute("noteObj") Note note)
	{
		note.setNote("default Note Heading");
		note.setDesc("default Note description");
		
		return "note-home-page-using-MVC-FormTag";
	}
	
	@RequestMapping("/submit-home-page-using-MVC-FormTag")
	public String saveNote(@ModelAttribute("noteObj") Note note) 
	{ 
		noteDao.save(note);
		return "submit-home-page-using-MVC-FormTag";
	}
	
	@RequestMapping("/find-all-notes")
	public String findAllNotes(Model model)
	{
		
	  model.addAttribute("myNotes", noteDao.findAllNotes().get(0));
	  
	  return "find-All-Notes-using-MVC-FormTag";
    }
	     
}
