package studentdatabaseapplication;

import java.util.Scanner;

public class StudentDatabaseApplication {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Input from user about number of student
		System.out.print("Enter number of students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		Student[] students = new Student[numberOfStudents];

		// Create the students based on user's input
		for (int i = 0; i < numberOfStudents; i++) {

			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}

		for (int i = 0; i < numberOfStudents; i++) {

			System.out.println(students[i].toString());
		}
		sc.close();
	}
}
