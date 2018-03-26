package com.guidals.org.data.guidalsrep;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.guidals.org.data.guidalsrep.compsit.CompRepo;
import com.guidals.org.data.guidalsrep.compsit.Compsit;
import com.guidals.org.data.guidalsrep.freesit.FreeSiteRepo;
import com.guidals.org.data.guidalsrep.freesit.Freeysit;
import com.guidals.org.data.guidalsrep.helpfor.Helpfor;
import com.guidals.org.data.guidalsrep.helpfor.HelpforRepo;
import com.guidals.org.data.guidalsrep.lang.Langua;
import com.guidals.org.data.guidalsrep.lang.LanguaRepo;
import com.guidals.org.data.guidalsrep.paidsit.PaidSiteRepo;
import com.guidals.org.data.guidalsrep.paidsit.Paidsite;
import com.guidals.org.data.guidalsrep.suggestions.Suggestions;
import com.guidals.org.data.guidalsrep.suggestions.SuggestionsRepo;



@RestController
public class CommonResor {

	 @Autowired
     LanguaRepo lr;
	 @Autowired 
	 PaidSiteRepo pr;
	 @Autowired 
	 FreeSiteRepo fr;
	 @Autowired
	 CompRepo cr;
     @Autowired
     HelpforRepo hr;
     @Autowired
     SuggestionsRepo sr;
     
	 @GetMapping("langone/{id}")
	 public Optional<Langua> getOne(@PathVariable int id) {
		 return lr.findById(id);
	 }
     @GetMapping("getnmid")
     public  List<Langua> getnmid()
     {
    	 return lr.findNameId();
     }
     @GetMapping("paidsites")
     public List<Paidsite> getPaidsit()
     {
    	 List<Paidsite> p= (List<Paidsite>) pr.findAll();
		 return p; 
     }
     @GetMapping("freesites")
     public List<Freeysit> getFreesit()
     {
    	 List<Freeysit> f= (List<Freeysit>) fr.findAll();
		 return f; 
     }
     @GetMapping("compitsite")
     public List<Compsit> getCompsit()
     {
    	 List<Compsit> c= (List<Compsit>) cr.findAll();
		 return c; 
     }
     @GetMapping("helpfor")
     public List<Helpfor> getHelpfr()
     {
    	 List<Helpfor> h= (List<Helpfor>) hr.findAll();
		 return h; 
     }
     
     @PostMapping("sugest")
     public void entersug(@Valid @RequestBody Suggestions sug) {
    	 sr.save(sug);    	 
     }
}


