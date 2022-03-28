package springmvc.controller;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
@RequestMapping("/home")
	public String home(Model model)
	{
	System.out.println("MVC");
	model.addAttribute("name", "jalaj");
		return "index";
	}
@RequestMapping("/help")
public ModelAndView help()
{
	ModelAndView mav=new ModelAndView();
	
	mav.addObject("name", "karan");
	System.out.println("MVC2");
	
	LocalDateTime now=LocalDateTime.now();
	mav.addObject("time",now);
	mav.setViewName("help");
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(12);
	list.add(13);
	list.add(14);
	mav.addObject("marks", list);
	
	return mav;
	
}
}

