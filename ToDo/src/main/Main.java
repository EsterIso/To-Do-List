package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		TaskManager taskManager = new TaskManager();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to your to do list. ");
		
		while(true) {
			
			System.out.println("Enter 1 if you'd like to see List of Task."
				+ "\nEnter 2 if you'd like to Add a Task."
				+ "\nEnter 3 if you'd like to Edit a Task."
				+ "\nEnter 4 if you'd like to Delete a Task."
				+ "\nEnter 5 if you'd like to Exit.");
		
			String input = scanner.nextLine();
			
			switch(input){
				case "1":
					taskManager.getTasks();
					break;
				case "2":
					taskManager.addTask(scanner);
					break;
				case "3":
					taskManager.editTask(scanner);
					break;
				case "4":
					taskManager.deleteTask(scanner);
					break;
				 case "5":
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid input. Please try again.\n");
			}
		
		}	
	}
	
	
}
