package com.amanuel.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCode {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		System.out.println(errors);
		return "index";
	}
	@RequestMapping("/code")
	public String theCode(@RequestParam(value = "name") String name, RedirectAttributes redirectAttributes, Model model) {
		String array[] = new String[5];
		array[0] = "Loyalty";
		array[1] = "Courage";
		array[2] = "Veracity";
		array[3] = "Compassion";
		array[4] = "Honor";
		for(int i = 0; i < array.length; i++) {
			if(name.equals(array[i])){
				return "codePage";
			}
			redirectAttributes.addFlashAttribute("errors", "Your must train harder!");
			return "redirect:/";
		}
		return "codePage";
	}
}
