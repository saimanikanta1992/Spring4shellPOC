package com.appsec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Threatmodel {
	@RequestMapping(value="/tm")
	public String validate(Pentest pen, Model model) throws Exception
	{
		model.addAttribute("appname", "pen:" + pen);
		return "processrequest";	
	}
	
}
