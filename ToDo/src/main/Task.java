package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
	
	private  String task;
	private  String dueDate;
	private  boolean completed;
	
	public Task(String task, String dueDate, boolean completed){
		
		this.task = task;
		this.dueDate = dueDate;
		this.completed = completed;
	}
	
	public String getName() {
        return task;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }
    
    public void setName(String newName) {
        task = newName;
    }

    public void setDueDate(String newDueDate) {
    	dueDate = newDueDate;
    }

    public void setCompleted(boolean newCompleted) {
        completed = newCompleted;
    }

    @Override
    public String toString() {
        return "Task: " + task + ", Due Date: " + dueDate + ", Completed: " + completed;
    }
	
	 
}
