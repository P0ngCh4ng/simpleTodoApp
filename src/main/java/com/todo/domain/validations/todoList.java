package com.todo.domain.validations;

public class todoList{
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String todoName;
	private String todoDeadline;
	private boolean did;

	public boolean isDid() {
		return did;
	}
	public void setDid(boolean did) {
		this.did = did;
	}
	public String getTodoName() {
		return todoName;
	}
	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}
	public String getTodoDeadline() {
		return todoDeadline;
	}
	public void setTodoDeadline(String todoDeadline) {
		this.todoDeadline = todoDeadline;
	}


}
