package com.guidals.org.data.guidalsrep.freesit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Freeysit {

	@Id
	@GeneratedValue
	private Integer id;
	private String chname;
	private String crename;
	private String logurl;
	private String descri;
	private String lnkto;
	public Integer getId() {
		return id;
	}
	public String getChname() {
		return chname;
	}
	public String getCrename() {
		return crename;
	}
	public String getLogurl() {
		return logurl;
	}
	public String getDescri() {
		return descri;
	}
	public String getLnkto() {
		return lnkto;
	}
}
