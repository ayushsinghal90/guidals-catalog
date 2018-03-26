package com.guidals.org.data.guidalsrep.suggestions;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Suggestions {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private boolean newsteler;
	private String about;
	private String descrip;
	
	public Suggestions() {
		super();
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsteler() {
		return newsteler;
	}

	public void setNewsteler(boolean newsteler) {
		this.newsteler = newsteler;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
}
