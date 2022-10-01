package com.guidals.org.guidals.catalog.compsit;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Compsit {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String crename;
	private String logurl;
	private String lnkto;
	private String describ;
}
