package com.todo.domain.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todos")
public class todoEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @Column(name="todoName")
	private String todoName;
    @Column(name="todoDeadline")
    private String todoDeadline;
    @Column(name="did")
    private boolean did;
    
    public boolean isDid() {
		return did;
	}
	public void setDid(boolean did) {
		this.did = did;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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