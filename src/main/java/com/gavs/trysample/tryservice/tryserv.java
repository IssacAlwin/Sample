package com.gavs.trysample.tryservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavs.trysample.tryentity.tryent;
import com.gavs.trysample.tryrepo.tryrepointer;

@Service
public class tryserv {
	
	private tryrepointer tryrepo;

	@Autowired
	public tryserv(tryrepointer tryrepo) {
		this.tryrepo = tryrepo;
	}
	
	//Create emply
	public void trysave(tryent tryent) {
		 tryrepo.save(tryent);
	}
	
	//view data
	public List<tryent> viewdata() {
		return tryrepo.findAll();
	}
	
	//delete emply
	public void deleteemply(int findid) {
		tryrepo.deleteById(findid);
 
	}
}
