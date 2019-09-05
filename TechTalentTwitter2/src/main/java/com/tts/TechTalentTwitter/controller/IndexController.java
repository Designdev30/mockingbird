package com.tts.TechTalentTwitter.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class IndexController {
	 @GetMapping(value="/login")
	    public String login(){
	        return "login";
	    }
	 
}
