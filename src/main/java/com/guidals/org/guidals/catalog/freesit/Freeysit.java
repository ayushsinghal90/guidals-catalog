package com.guidals.org.guidals.catalog.freesit;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Freeysit {

	@Id
	@GeneratedValue
	private Integer id;
	private String chname;
	private String crename;
	private String logurl;
	private String descri;
	private String lnkto;
}
