package www.silver.hom;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller		
public class WordController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(WordController.class);
	
	@RequestMapping(value = "word", method = RequestMethod.GET)		 
	public String home(Locale locale, Model model) {
		logger.info("Welcome word! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "word/index";
	}
}

	