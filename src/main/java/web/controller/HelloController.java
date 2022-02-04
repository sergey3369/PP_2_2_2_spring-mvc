package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web.model.Car;
import web.service.Service;
import web.service.ServiceCarsImpl;

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
		model.addAttribute("messages", messages);
		return "index";
	}
	@GetMapping(value = "/cars")
	public String printCars(ModelMap model, @RequestParam String count) {
		Service service = new ServiceCarsImpl();
		List<Car> cars = service.getEntity(Integer.parseInt(count));
		model.addAttribute("cars",cars);
		return "cars";
	}
	
}