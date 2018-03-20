package com.guidals.org.data.guidalsrep.paid;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.guidals.org.data.guidalsrep.lang.Langua;

@Entity
public class Paid {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String crename;
	private String descri;
	private String url;
	private String lecimg;
	private String chnlan;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Langua langp;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCrename() {
		return crename;
	}

	public String getDescri() {
		return descri;
	}

	public String getUrl() {
		return url;
	}

	public String getLecimg() {
		return lecimg;
	}

	public String getChnlan() {
		return chnlan;
	}

	public Langua getLangp() {
		return langp;
	}	
}
