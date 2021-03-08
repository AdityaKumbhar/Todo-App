package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;


@Controller
public class HomeController {
	
	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		String str="home";
		m.addAttribute("page", str);
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		
		m.addAttribute("todos",list);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addjjTODo(Model m)
	{	
		Todo t=new Todo();
		m.addAttribute("todo",t);
		m.addAttribute("page", "add");
		return "home";
	}
	
	@RequestMapping(value="/saveTodo",method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo t, Model m)
	{
		System.out.println(t);
		t.setTodoDate(new Date());
		//getting The todo list from the context
		
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		list.add(t);
		m.addAttribute("msg","SuccessFully Added.....");
		
		
		return "home";					
	}
}
