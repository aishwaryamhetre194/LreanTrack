package com.airtribe.learntrack.service;

import java.util.ArrayList;
import java.util.List;

import com.airtribe.learntrack.entity.Enrollment;

public class EnrollmentService {

    List<Enrollment> enrollmentList = new ArrayList<>();
    
    public void addEnrollment(Enrollment enrollmentObj) {
         if (enrollmentObj == null) {
            System.out.println("Enrollment cannot be null.");
            return;
        }

        enrollmentList.add(enrollmentObj);
        System.out.println("Enrollment added successfully!");
    }

    public void viewEnrollmentsForStudent(int studentId1) {
        boolean found = false;

        for (Enrollment enrollment : enrollmentList) {

            if (enrollment.getStudentId() == studentId1) {

                System.out.println("Enrollment ID: " + enrollment.getId());
                System.out.println("Student ID: " + enrollment.getStudentId());
                System.out.println("Course ID: " + enrollment.getCourseId());
                System.out.println("Enrollment Date: " + enrollment.getEnrollmentDate());
                System.out.println("Status: " + enrollment.getStatus());
                System.out.println("-------------------------");

                found = true;
            }
        }

        if (!found) {
            System.out.println(
                "No enrollments found for Student ID: " + studentId1
            );
        }
    }

    public void updateEnrollmentStatus(int enrollmentId, String newStatus) {
         for (Enrollment enrollment : enrollmentList) {

            if (enrollment.getId() == enrollmentId) {

                enrollment.setStatus(newStatus);

                System.out.println("Enrollment status updated successfully!");
                System.out.println("New Status: " + enrollment.getStatus());
                return;
            }
        }

        System.out.println("Enrollment not found with ID: " + enrollmentId);
    }
      
}
