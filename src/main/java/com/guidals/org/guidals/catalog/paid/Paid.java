package com.guidals.org.guidals.catalog.paid;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.guidals.org.guidals.catalog.lang.Langua;
import lombok.Getter;

@Entity
@Getter
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
}
