package com.srinjoy.login;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinjoy.login.LoginService;
import com.srinjoy.todo.TodoService;

@Controller
public class TodoController { 
	
	//Set the login Service - Auto Wiring
	@Autowired
	TodoService service;
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	
	public String listTodos(ModelMap model) {
		
		model.addAttribute("todos",service.retrieveTodos("Srinjoy"));
		return "list-todos";
	}
	@RequestMapping(value="/add-todo", method = RequestMethod.GET)
	
	public String showTodoPage() {
		
		
		return "todo";
	}
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	
	public String addTodo(ModelMap model, @RequestParam String desc) {
		service.addTodo("Srinjoy", desc, new Date(), false);
		model.clear();
		return "redirect:list-todos";
	}
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		service.deleteTodo(id);

		return "redirect:/list-todos";
	}

		
}


 