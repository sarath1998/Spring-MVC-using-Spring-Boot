package com.sarathchandraProjects.springMVCFormTags.Model;

public class Note {
	
	private String note;
	private String desc;
	
	public Note()
	{
	   this.note = "default note";
	   this.desc = "default desc";
	}
	
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}


	@Override
	public String toString() {
		return "Note [note=" + note + ", desc=" + desc + "]";
	}
	
	
}
