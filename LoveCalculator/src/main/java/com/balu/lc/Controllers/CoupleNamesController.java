package com.balu.lc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.balu.lc.Dto.CoupleNamesDto;

@Controller
public class CoupleNamesController {
	
	@RequestMapping("/loveCalculate")
	public String welcomePage(@ModelAttribute("coupleName")  CoupleNamesDto dto)
	{
		return "LoveCalculate-page";
	}
	
	@RequestMapping("/process-loveCalculate")
	public String showCouplesName(@ModelAttribute("coupleName")  CoupleNamesDto dto)
	{
		return "result-couplesName";
	}

}
