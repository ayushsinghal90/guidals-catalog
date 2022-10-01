package com.guidals.org.guidals.catalog.helpfor;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Helpfor {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String logurl;
	private String lnkto;
	private String creanm;
	private String describ;
}
