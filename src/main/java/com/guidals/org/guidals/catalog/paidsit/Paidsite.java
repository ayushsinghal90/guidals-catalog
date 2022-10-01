package com.guidals.org.guidals.catalog.paidsit;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Paidsite {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String logourl;
	private String lnkto;
	private String creanm;
	private String describ;
}
