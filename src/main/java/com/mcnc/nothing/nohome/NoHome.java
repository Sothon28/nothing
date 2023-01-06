package com.mcnc.nothing.nohome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NoHome {
	
	@RequestMapping("home")
	public String noHome() {
		
		return "You have no HOME, Bitch.";
	}
}
