package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

	List<Task> tasks = new ArrayList<Task>();
	
	//gets To Do List
	void getTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No tasks available. \n");
		}else {
			//System.out.println("Task: ");
			for(Task t : tasks) {
				System.out.println(t);
			}
		}
		System.out.println("");
	}
	 //adds new task
	 void addTask(Scanner scanner) {
		 //ask user for new task name	
		 System.out.println("Enter Task Name: ");
		 String name = scanner.nextLine();
		 //ask user for new task due date
		 System.out.println("Enter Task Due Date: ");
		 String dueDate = scanner.nextLine();
		 //adds task using user inputs
		 tasks.add(new Task(name, dueDate, false));
		 System.out.println("New task added succesfully! \n" );
			
	 }
	 //edits Task 
	 void editTask(Scanner scanner) {
		//checks if 
		 if(tasks.isEmpty()) {
				System.out.println("No tasks available. \n");
			}else {
				System.out.println("Which task would you like to edit? (choose number)");
				for(int i = 0; i< tasks.size(); i++) {
					System.out.println((i+1) + ". " + tasks.get(i));
				}
		int inputTask = Integer.valueOf(scanner.nextLine());
		
		//check if valid input
		if(inputTask >=1 && inputTask <= tasks.size()) {
			System.out.println("What would you like to edit? Enter 1 for Task Name, 2 for Task Due Date, 3 For Completion");
			
			String inputValue = scanner.nextLine();
		
			switch(inputValue){
				case "1":
					System.out.println("Enter new name: ");
					String name = scanner.nextLine();
					tasks.get(inputTask - 1).setName(name);
					System.out.println("Edit: Task name changed \n");
					break;
				case "2":
					System.out.println("Enter new due date: ");
					String date = scanner.nextLine();
					tasks.get(inputTask - 1).setDueDate(date);
					System.out.println("Edit: " + tasks.get(inputTask - 1).getName() + "Due Date Changed \n");
					break;
				case "3":
					if(tasks.get(inputTask - 1).isCompleted() != true) {
						tasks.get(inputTask - 1).setCompleted(true);
						System.out.println("Edit: " + tasks.get(inputTask - 1).getName() + " Completed \n");
					}else {
						tasks.get(inputTask - 1).setCompleted(false);
						System.out.println("Edit: " + tasks.get(inputTask - 1).getName() + " Not Completed \n");
					}
					break;
				default:
					System.out.println("Incorrect Input \n");
					break;
			}
		}else {
			//if input value not valid
			System.out.println("Incorrect Input \n");
			
		}
		}			
	} 
	 // deletes a task 
	 void deleteTask(Scanner scanner) {
		 if(tasks.isEmpty()) {
				System.out.println("No tasks available. \n");
			}else {
				System.out.println("Which task would you like to delete? (choose number)");
				for(int i = 0; i< tasks.size(); i++) {
					System.out.println((i+1) + ". " + tasks.get(i));
				}
				
		int inputTask = Integer.valueOf(scanner.nextLine());
		
		//check if valid input
		if(inputTask >=1 && inputTask <= tasks.size()) {
			System.out.println("Task: " + tasks.get(inputTask - 1).getName() + ", Succesfully Deleted \n");
			tasks.remove(inputTask - 1);
		}else {
			//if input value not valid
			System.out.println("Incorrect Input \n");
		}
		
	 }
	 }
	 
}
