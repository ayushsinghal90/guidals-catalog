package com.guidals.org.guidals.catalog.lang;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LanguaRepo extends CrudRepository<Langua,Integer> {

	 @Query(value="select id,title,logo from Langua")
	  List<Langua> findNameId();
}
