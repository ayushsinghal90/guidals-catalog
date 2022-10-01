package com.guidals.org.guidals.catalog.lang;



import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.guidals.org.guidals.catalog.books.Book;
import com.guidals.org.guidals.catalog.free.Free;
import com.guidals.org.guidals.catalog.paid.Paid;
import lombok.Getter;

@Entity
@Getter
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
}
