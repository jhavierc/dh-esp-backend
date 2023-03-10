package co.dh.grupo2.entity;

import java.util.List;

import co.dh.grupo2.dto.MessageDTO;

public class Course extends MessageDTO{

	private int id;
	private String name;
	private List<Chapter> chapters;
	
   public Course() {
	   super("");
   }
	public Course(int id, String name, List<Chapter> chapters) {
		super("");
		this.id = id;
		this.name = name;
		this.chapters = chapters;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

}
