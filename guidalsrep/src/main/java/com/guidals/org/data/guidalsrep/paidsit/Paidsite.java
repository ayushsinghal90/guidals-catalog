package com.guidals.org.data.guidalsrep.paidsit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Paidsite {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String logourl;
	private String lnkto;
	private String creanm;
	private String describ;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLogourl() {
		return logourl;
	}
	public String getLnkto() {
		return lnkto;
	}
	public String getCreanm() {
		return creanm;
	}
	public String getDescrib() {
		return describ;
	}
	
}
