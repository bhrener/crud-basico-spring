package npi.contatos.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam(value = "erro", required = false) String erro, Model model) {
		if (erro != null) {
			model.addAttribute("erro", "Usuário e/ou senha inválidos!");
		}
		return "login";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("erro", "Usuário e/ou senha inválidos");
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth !=null){
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		
		return "redirect:login";
	}
}