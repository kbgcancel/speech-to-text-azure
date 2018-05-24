package azure.speechtotext.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class MainController {

	/**
	 * Displays home page
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String home() {

		return ("index");
	}
}
