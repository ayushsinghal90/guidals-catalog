package com.guidals.org.guidals.catalog.suggestions;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
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
}
