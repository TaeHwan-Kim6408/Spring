package www.silver.hom;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** aaa
 * Handles requests for the application home page.
 */
@Controller		// ��Ʈ�ѷ�, Ŭ������Ȱ
public class HomeController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)		// Ŭ���̾�Ʈ�� ��û�ϴ� ����, 
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";	// home -> �����ϴ� ���ϸ� ( jsp )
	}
	
	//https://bubblecastle.tistory.com/9
	
	@RequestMapping(value = "timeline", method = RequestMethod.GET)
	public String timeline() {
		return "timeline";
	}
	
	@RequestMapping(value = "viewMessage", method = RequestMethod.GET)
	public String viewMessage() {
		return "viewMsg";
	}
}

	