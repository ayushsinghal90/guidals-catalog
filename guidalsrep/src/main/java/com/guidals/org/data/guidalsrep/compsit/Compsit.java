package com.guidals.org.data.guidalsrep.compsit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compsit {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String crename;
	private String logurl;
	private String lnkto;
	private String describ;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCrename() {
		return crename;
	}
	public String getLogurl() {
		return logurl;
	}
	public String getLnkto() {
		return lnkto;
	}
	public String getDescrib() {
		return describ;
	}
}
