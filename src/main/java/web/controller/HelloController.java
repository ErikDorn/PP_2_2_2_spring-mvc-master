package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		messages.add("This app will show you all the cars available in the list.\n Make your choice!");
		messages.add("You can also copy the query from this table");
		messages.add("and send the request to the server manually:");
		messages.add("/cars?count=1");
		messages.add("/cars?count=2");
		messages.add("/cars?count=3");
		messages.add("/cars?count=4");
		messages.add("/cars?count=5");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}