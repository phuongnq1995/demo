package org.app.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("auth")
public class AuthController {

	private static final String LOGIN_FORM_PATH = "auth/loginForm";

	@ModelAttribute
	public AuthForm setupForm() {
		return new AuthForm();
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return LOGIN_FORM_PATH;
	}

}
