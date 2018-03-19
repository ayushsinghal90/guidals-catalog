package com.guidals.org.data.guidalsrep.lang;



import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.guidals.org.data.guidalsrep.books.Book;
import com.guidals.org.data.guidalsrep.free.Free;
import com.guidals.org.data.guidalsrep.paid.Paid;

@Entity
public class Langua {
    @Id
    @GeneratedValue
	private Integer id;
    private String title;
    private String descrip;
    private String imple;
    private String logo;
    
    @OneToMany(mappedBy="langb")
    private List<Book> book;
    
    @OneToMany(mappedBy="langp")
    private List<Paid> paid;
    
    @OneToMany(mappedBy="langf")
    private List<Free> free;
    
	public Langua() {
	
	}

	public Integer getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescrip() {
		return descrip;
	}

	public String getImple() {
		return imple;
	}
    
	public String getLogo() {
		return logo;
	}

	public List<Book> getBook() {
		return book;
	}

	public List<Paid> getPaid() {
		return paid;
	}

	public List<Free> getFree() {
		return free;
	}
}
