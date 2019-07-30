package com.app.todo.razio;


import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.todo.razio.todoService;
import com.app.todo.razio.todoRepository;

@Controller
public class toDoController {

	@Autowired
	private todoService todoService;
	@Autowired 
	private todoRepository todoRepository;
	private List<todoEntity>todos;
	private boolean nullcheck;
	
    @GetMapping("/index")
    public String index(Model model) {
    	todos=todoRepository.findAll();
    	model.addAttribute("todos",todos);
    	if(todos.size()==0) {
    	nullcheck = true;
    	}else
    	nullcheck=false;
    	model.addAttribute("NullCheck",nullcheck);
        return "index";
    }
    
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
    	todoEntity todo = todoRepository.getOne(id);
    	model.addAttribute("todo",todo);
    	return "edit";
    }
    @GetMapping("search")
    public ModelAndView search(@RequestParam String keyword) {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("index");
    if (StringUtils.isNotEmpty(keyword)) {
        List<todoEntity> list = todoRepository.findTodos(keyword);
        mv.addObject("todos",list);
    }
        return mv;
}
    @PutMapping("{id}")
    public String update(@PathVariable long id,@ModelAttribute todoList todoListed) {
    	todoListed.setId(id);
    	todoRepository.save(todoService.createTodo(todoListed));
    	return "redirect:/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
    	model.addAttribute("todoList",new todoList());
    	return "create";
    }
    @PostMapping("/confirm")
    public String backIndex(Model model,@ModelAttribute todoList todoList) {
    	todoRepository.save(todoService.createTodo(todoList));
    	return "redirect:/index";
    }
    @DeleteMapping("{id}")
    public String destroy(@PathVariable Long id, todoList todoListed) {
        todoRepository.delete(todoService.createTodo(todoListed));
        return "redirect:/index";
    }
}