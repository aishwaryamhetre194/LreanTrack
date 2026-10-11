package com.airtribe.learntrack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import  com.airtribe.learntrack.entity.Student;

public class StudentService {

    Scanner sc = new Scanner(System.in);
    List<Student> studenList = new ArrayList<>();

    public void addStudent(Student studentobj) {
        if (studentobj == null) {
            System.out.println("Please enter correct values.");
            return;
        }
        studenList.add(studentobj);
        System.out.println("Student added successfully!");
    }

    public void searchStudentById(int studentId) {
        for (Student student : studenList) {
            if (student.getId() == studentId) {
                System.out.println("Student found:");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found!");
    }


    public void updateStudent(int studentId, Scanner sc) {
        Student studentToUpdate = null;

        for (Student student : studenList) {
            if (student.getId() == studentId) {
                studentToUpdate = student;
                break;
            }
        }

        if (studentToUpdate == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("What do you want to update?");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Email");
        System.out.println("4. Batch");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter new first name: ");
                studentToUpdate.setFirstName(sc.nextLine());
                break;

            case 2:
                System.out.print("Enter new last name: ");
                studentToUpdate.setLastName(sc.nextLine());
                break;

            case 3:
                System.out.print("Enter new email: ");
                studentToUpdate.setEmail(sc.nextLine());
                break;

            case 4:
                System.out.print("Enter new batch: ");
                studentToUpdate.setBatch(sc.nextLine());
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Student updated successfully!");
    }
    
    public void listOfStudents() {
        if (studenList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : studenList) {
            System.out.println(student);
        }
    }
}

