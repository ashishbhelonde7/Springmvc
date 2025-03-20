package com.cjc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import java.util.*;
import com.cjc.*;
@Controller
@Service
public class MyController {
	List<Student>al=new ArrayList<>();
	@RequestMapping("/openregister")
	public String gotoregistser()
	{
		return"register";
	}
	
	@RequestMapping("/reg")
	public String togoregistertologin(@ModelAttribute Student s)
	{
		al.add(s);
		return"login";
	}
	
	@RequestMapping("/openlogin")
	public String doregister(@RequestParam("un")String un,@RequestParam("ps")String ps,Model m)
	{
		System.out.println("username="+un);
		System.out.println("password="+ps);
		for(Student stu:al)
		{
			if(un.equals(stu.getUn()) && ps.equals(stu.getPs()))
			{
				m.addAttribute("data",al);
				return"success";
			}
		}
		return"login";
	}
	

}
