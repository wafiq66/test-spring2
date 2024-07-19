package com.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorView {
	
	@GetMapping({"/","/calculator"})
	public String viewCalculator(Model model) {
		return "calculator";
	}
}
