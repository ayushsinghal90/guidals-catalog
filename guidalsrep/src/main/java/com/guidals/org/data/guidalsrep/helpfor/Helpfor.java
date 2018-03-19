package com.guidals.org.data.guidalsrep.helpfor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Helpfor {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String logurl;
	private String lnkto;
	private String creanm;
	private String describ;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCreanm() {
		return creanm;
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
