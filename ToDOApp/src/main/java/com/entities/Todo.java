package com.entities;

import java.util.Date;

public class Todo {
	private String todoTitle;
	private String todoContent;
	private Date todoDate;
	public Todo(String todoTitle, String todoContent, Date todoDate) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.todoDate = todoDate;
	}
	

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getTodoDate() {
		return todoDate;
	}
	public void setTodoDate(Date todoDate) {
		this.todoDate = todoDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTodoTitle()+" : "+this.todoContent;
	}

}
