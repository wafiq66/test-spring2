package com.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sum {
	
	
	 @PostMapping("/sum")
	    public String calculateSum(@RequestParam("num1") int num1, 
	                               @RequestParam("num2") int num2, 
	                               Model model) {
	        int sum = num1 + num2;
	        model.addAttribute("result", sum);
	        return "calculator";
	    }
}
