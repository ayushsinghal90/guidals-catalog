package com.guidals.org.data.guidalsrep.books;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.guidals.org.data.guidalsrep.lang.Langua;

@Entity
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
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Langua langb;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthrnm() {
		return authrnm;
	}
	public String getCured() {
		return cured;
	}
	public String getImgurl() {
		return imgurl;
	}
	public String getDescib() {
		return descib;
	}
	public Langua getLangb() {
		return langb;
	}
	public String getAmazlnk() {
		return amazlnk;
	}
	public String getFliplnk() {
		return fliplnk;
	}
}

