package org.app.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static final String HOME_PATH = "home/homepage";

	@RequestMapping(value = "/")
	private String home(Model model) {
		return HOME_PATH;
	}

}
