package com.belcode.photoapp.api.users.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private ServerProperties serverProperties;
	
	@GetMapping("/status/check")
	public String status() {
		int port = serverProperties.getPort();
		return "working in port " + port;
	}

}
