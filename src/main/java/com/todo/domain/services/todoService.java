package com.todo.domain.services;

import org.springframework.stereotype.Service;

import com.todo.domain.models.todoEntity;
import com.todo.domain.validations.todoList;

@Service
public class todoService {
	
public todoEntity createTodo(todoList todoList) {
todoEntity todoEntity = new todoEntity();
todoEntity.setId(todoList.getId());
todoEntity.setTodoName(todoList.getTodoName());
todoEntity.setTodoDeadline(todoList.getTodoDeadline());
todoEntity.setDid(todoList.isDid());
return todoEntity;
}

}
