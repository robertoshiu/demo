package com.chainmeans.poc;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home.htm", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
				
		String formattedDate = DateTimeFormat.forPattern("yyyy-MM-dd kk-mm-ss").print(DateTime.now());
		
		logger.info("The Server Time is {}.", formattedDate);
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
