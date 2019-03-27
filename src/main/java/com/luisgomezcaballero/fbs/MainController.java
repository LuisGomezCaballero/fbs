package com.luisgomezcaballero.fbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

	@GetMapping("/index")
	public String input(Model model) {
		model.addAttribute("myBean", new MyBean());
		return "index";
	}

	@PostMapping("/output")
	public String output(@ModelAttribute MyBean myBean) {
		return "output";
	}

}
