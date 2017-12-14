package cor.com.seven.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cor.com.seven.pojo.User;
import cor.com.seven.service.IUserService;

@Controller
@RequestMapping("/")
public class SystemController {

	@Autowired
	private IUserService userService;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(int id, String password, HttpSession session) {
		User user = userService.login(new User(id, password));
		if (user != null) {
			session.setAttribute("user", user);
			return "redirect:index";
		}
		return "login";
	}

	@RequestMapping(value="reg", method = RequestMethod.GET)
	public String reg(){
		return "reg";
	}
	
	@RequestMapping(value="reg",method = RequestMethod.POST)
	public @ResponseBody Boolean reg(int id,String password){
		return userService.reg(new User(id,password));
	}
}
