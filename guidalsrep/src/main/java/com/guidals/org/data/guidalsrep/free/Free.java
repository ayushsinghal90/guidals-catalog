package com.guidals.org.data.guidalsrep.free;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.guidals.org.data.guidalsrep.lang.Langua;

@Entity
public class Free {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String chnam;
	private String crename;
	private String descri;
	private String url;
	private String imgurl;
	private String spoklang;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Langua langf;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getChnam() {
		return chnam;
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
	public String getImgurl() {
		return imgurl;
	}
	public String getSpoklang() {
		return spoklang;
	}
	public Langua getLangf() {
		return langf;
	}
}
