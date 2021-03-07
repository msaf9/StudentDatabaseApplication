package studentdatabaseapplication;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int year;
	private String studentId;
	private String courses = "";
	private int balance = 0;
	private static int courseCost = 600;
	private static int id = 30;

	// Constructor for student's name and year
	public Student() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student first name:");
		this.firstName = sc.nextLine();

		System.out.print("Enter student last name:");
		this.lastName = sc.nextLine();

		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student year:");
		this.year = sc.nextInt();

		setStudentId();
	}

	// ID
	private void setStudentId() {

		id++;
		// year + Id
		this.studentId = year + "" + id;
	}

	// Courses
	public void enroll() {

		// Get inside the loop, hit 0
		do {
			System.out.print("Enter course to enroll (Q to quit):");
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n   " + course;
				balance = balance + courseCost;
			} else {
				break;
			}
		} while (1 != 0);
	}

	// Balance
	public void viewBalance() {

		System.out.println("Your balance is: $" + balance);
	}

	// Payment
	public void payTuition() {

		viewBalance();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your payment: $");
		int payment = sc.nextInt();
		balance = balance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}

	// Status
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nYear: " + year + "\nStudentID: " + studentId
				+ "\nCourses enrolled:" + courses + "\nBalance: $" + balance;
	}
}
