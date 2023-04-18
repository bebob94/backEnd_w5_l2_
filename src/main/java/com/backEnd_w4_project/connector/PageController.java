package com.backEnd_w4_project.connector;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.backEnd_w4_project.enum_.TipoPostazione;
import com.backEnd_w4_project.model.Postazione;
import com.backEnd_w4_project.model.infoPage;


@Controller
public class PageController {
	
	@GetMapping("/homepage")
	public @ResponseBody String getHomePage() {
		return "Prima pagina Spring Web MVC";
	}
	
	@GetMapping("/homepage/param")
	public @ResponseBody String getHomePageQueryString(@RequestParam String test) {
		// http://localhost:8080/homepage/param?test=ciao
		return "Prima pagina Spring Web MVC QueryString: " + test;
	}
	
	@GetMapping("/homepage/param/{test}")
	public @ResponseBody String getHomePagePathParam(@PathVariable String test) {
		// http://localhost:8080/homepage/param/ciao
		return "Prima pagina Spring Web MVC PathParam: " + test;
	}
	
	
	@GetMapping("/homepage/infoPage/{lang}")
	public ModelAndView getHomePageThymeleaf(@PathVariable String lang) {
		return new ModelAndView("myInfoPage", "infoPage", new infoPage(lang));
	}
	
}