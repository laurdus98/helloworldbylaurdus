package com.hellowordbylaurdus.demo.resources;

import java.security.Principal;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldbylaurdusResource {

	@RequestMapping(value = "/me", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Principal me(Principal principal) {
		return principal;
	}

}
