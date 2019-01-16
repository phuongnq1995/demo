package org.app.auth;

import org.apache.commons.beanutils.BeanUtils;
import org.app.common.DemoCommon;
import org.domain.entity.User;
import org.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("auth")
public class AuthController {

	private static final String LOGIN_FORM_PATH = "auth/loginForm";
	private static final String REGISTER_FORM_PATH = "auth/registerForm";

	@Autowired
	UserService userService;

	@ModelAttribute
	public AuthForm setupForm() {
		return new AuthForm();
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return LOGIN_FORM_PATH;
	}

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register() {
		return REGISTER_FORM_PATH;
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String processRegistration(@Validated AuthForm authForm, BindingResult bindingResult, Model model,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return REGISTER_FORM_PATH;
		}
		try {
			User user = new User();
			BeanUtils.copyProperties(user, authForm);
			userService.register(user);
		} catch (Exception ex) {
			model.addAttribute("message", ex.getMessage());
			return REGISTER_FORM_PATH;
		}
		redirectAttributes.addFlashAttribute("message", "register success");
		return DemoCommon.REDIRECT_HOME_PATH;
	}
}
