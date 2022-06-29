package com.gavs.trysample.trycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gavs.trysample.tryentity.tryent;
import com.gavs.trysample.tryservice.tryserv;


@RestController
@RequestMapping("/sample")
public class trycontrol {
	
	private tryserv tryserv1;
	
	@Autowired
	public trycontrol(tryserv tryserv1) {
		super();
		this.tryserv1 = tryserv1;
	}
	
	@PostMapping("/postdata")
	public tryent save(@RequestBody tryent tryent1) {
		tryserv1.trysave(tryent1);
		return tryent1;
	}
	
	@GetMapping("/getdata")
	public List<tryent> view(){
		return tryserv1.viewdata();
	}
	
//	@DeleteMapping("/deletedata/{theid}")
//	public String deletebyid(@PathVariable int theid) {
//		
//	}
}
