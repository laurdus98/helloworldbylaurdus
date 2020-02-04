package com.hellowordbylaurdus.demo.resources;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldbylaurdusTemplate {

	@RequestMapping(value = { "/", "/index"})
	public String index(Model model) {
		model.addAttribute("time", LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		return "index";
	}

}
