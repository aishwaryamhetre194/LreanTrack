
package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.service.CourseService;
import com.airtribe.learntrack.service.StudentService;
import com.airtribe.learntrack.service.EnrollmentService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        boolean codeStatus = true;
        Scanner sc = new Scanner(System.in);

        StudentService studentServiceObj = new StudentService();
        CourseService courseServiceobj = new CourseService();
        EnrollmentService enrollmentServiceObj = new EnrollmentService();

        while (codeStatus) {
            System.out.println("\nWelcome to learnTrack");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Enrollment Management");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    boolean studentMenu = true;

                    while (studentMenu) {
                        System.out.println("\n----Welcome to Student Management----");
                        System.out.println("1. Add Student");
                        System.out.println("2. Search Student by ID");
                        System.out.println("3. Update Student");
                        System.out.println("4. List All Students");
                        System.out.println("5. Deactivate Student");
                        System.out.println("6. Back to Main Menu");

                        int studentChoice = sc.nextInt();
                        sc.nextLine();

                        switch (studentChoice) {
                            case 1:
                                System.out.println("Enter First name: ");
                                String firstName = sc.nextLine();

                                System.out.println("Enter Last name: ");
                                String lastName = sc.nextLine();

                                System.out.println("Enter Student Email: ");
                                String email = sc.nextLine();

                                System.out.println("Enter Batch: ");
                                String batch = sc.nextLine();

                                System.out.println("Enter Is student Active (true/false): ");
                                boolean active = sc.nextBoolean();
                                sc.nextLine();

                                Student studentobj = new Student(
                                    firstName, lastName, email, batch, active
                                );
                                studentServiceObj.addStudent(studentobj);
                                break;

                            case 2:
                                System.out.print("Enter Student ID: ");
                                int searchId = sc.nextInt();

                                studentServiceObj.searchStudentById(searchId);
                                break;

                            case 3:
                                System.out.println("Enter Student Id: ");
                                int id = sc.nextInt();

                                studentServiceObj.updateStudent(id, sc);
                                break;

                            case 4:
                                studentServiceObj.listOfStudents();
                                break;

                            case 5:
                                System.out.println("Student deactivation selected.");
                                // Add your existing deactivate student method here.
                                break;

                            case 6:
                                System.out.println("Returning to Main Menu...");
                                studentMenu = false;
                                break;

                            default:
                                System.out.println("Please enter valid choice");
                                break;
                        }
                    }
                    break;

                case 2:
                    boolean courseMenu = true;

                    while (courseMenu) {
                        System.out.println("\n----Welcome to Course Management----");
                        System.out.println("1. Add New Course");
                        System.out.println("2. Activate/Deactivate Course");
                        System.out.println("3. View All Courses");
                        System.out.println("4. Back to Main Menu");

                        int courseChoice = sc.nextInt();
                        sc.nextLine();

                        switch (courseChoice) {
                            case 1:
                                System.out.println("Enter course name:");
                                String name = sc.nextLine();

                                System.out.println("Enter the detailed description of course:");
                                String describtion = sc.nextLine();

                                System.out.println("Enter the course duration:");
                                int duration = sc.nextInt();

                                System.out.println("Enter course is active or deactive (true/false):");
                                boolean active = sc.nextBoolean();
                                sc.nextLine();

                                Course courseObj = new Course(
                                    name, describtion, duration, active
                                );
                                courseServiceobj.addCourse(courseObj);
                                break;

                            case 2:
                                System.out.print("Enter Course ID: ");
                                int courseIdToChange = sc.nextInt();

                                System.out.println("1. Activate Course");
                                System.out.println("2. Deactivate Course");
                                System.out.print("Enter your choice: ");

                                int statusChoice = sc.nextInt();

                                if (statusChoice == 1) {
                                    courseServiceobj.setCourseStatus(
                                        courseIdToChange, true
                                    );
                                } else if (statusChoice == 2) {
                                    courseServiceobj.setCourseStatus(
                                        courseIdToChange, false
                                    );
                                } else {
                                    System.out.println("Invalid choice!");
                                }
                                break;

                            case 3:
                                System.out.println("List of Courses");
                                courseServiceobj.listOfCourses();
                                break;

                            case 4:
                                System.out.println("Returning to Main Menu...");
                                courseMenu = false;
                                break;

                            default:
                                System.out.println("Please enter valid choice");
                                break;
                        }
                    }
                    break;

                case 3:
                    boolean enrollmentMenu = true;

                    while (enrollmentMenu) {
                        System.out.println("\n----Welcome to Enrollment Management----");
                        System.out.println("1. Enroll a Student in a Course");
                        System.out.println("2. View Enrollments for a Student");
                        System.out.println("3. Mark Enrollment as Completed/Cancelled");
                        System.out.println("4. Back to Main Menu");

                        int enrollmentChoice = sc.nextInt();
                        sc.nextLine();

                        switch (enrollmentChoice) {
                            case 1:
                                System.out.println("Enter Student Id: ");
                                int studentId = sc.nextInt();

                                System.out.println("Enter Course Id: ");
                                int courseId = sc.nextInt();

                                LocalDate enrollmentDate = LocalDate.now();
                                String status = "Active";

                                Enrollment enrollmentObj = new Enrollment(
                                    studentId, courseId, enrollmentDate, status
                                );
                                enrollmentServiceObj.addEnrollment(enrollmentObj);
                                break;

                            case 2:
                                System.out.println("Enter Student id to view enrollment");
                                int studentId1 = sc.nextInt();

                                enrollmentServiceObj.viewEnrollmentsForStudent(
                                    studentId1
                                );
                                break;

                            case 3:
                                System.out.print("Enter Enrollment ID: ");
                                int enrollmentId = sc.nextInt();

                                System.out.println("Choose new status:");
                                System.out.println("1. Completed");
                                System.out.println("2. Cancelled");
                                System.out.print("Enter your choice: ");

                                int statusChoice = sc.nextInt();

                                switch (statusChoice) {
                                    case 1:
                                        enrollmentServiceObj.updateEnrollmentStatus(
                                            enrollmentId, "Completed"
                                        );
                                        break;

                                    case 2:
                                        enrollmentServiceObj.updateEnrollmentStatus(
                                            enrollmentId, "Cancelled"
                                        );
                                        break;

                                    default:
                                        System.out.println(
                                            "Please enter a valid status choice."
                                        );
                                        break;
                                }
                                break;

                            case 4:
                                System.out.println("Returning to Main Menu...");
                                enrollmentMenu = false;
                                break;

                            default:
                                System.out.println("Enter valid Choice");
                                break;
                        }
                    }
                    break;

                case 4:
                    codeStatus = false;
                    System.out.println("Exiting LearnTrack...");
                    break;

                default:
                    System.out.println("Enter correct choice");
                    break;
            }
        }

        sc.close();
    }
}
