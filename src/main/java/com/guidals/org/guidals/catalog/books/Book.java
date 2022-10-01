package com.guidals.org.guidals.catalog.books;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.guidals.org.guidals.catalog.lang.Langua;
import lombok.Getter;

@Entity
@Getter
public class Book {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String authrnm;
	private String cured;
	private String imgurl;
	private String amazlnk;
	private String fliplnk;
	private String descib;
	private Langua langb;
}

