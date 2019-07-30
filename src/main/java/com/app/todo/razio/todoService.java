package com.app.todo.razio;

import org.springframework.stereotype.Service;

import com.app.todo.razio.todoEntity;
import com.app.todo.razio.todoList;

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
