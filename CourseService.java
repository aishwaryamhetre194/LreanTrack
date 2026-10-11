package com.airtribe.learntrack.service;

import java.util.ArrayList;
import java.util.List;

import com.airtribe.learntrack.entity.Course;

public class CourseService {

    List<Course> courseList = new ArrayList<>();

    public void addCourse(Course courseObj) {
        if (courseObj == null) {
            System.out.println("Course cannot be null.");
            return;
        }

        courseList.add(courseObj);
        System.out.println("Course added successfully!");
    }
    
    public void setCourseStatus(int courseId, boolean active) {
        for (Course course : courseList) {
            if (course.getId() == courseId) {
                if (course.isActive() == active) {
                    System.out.println(active ? "Course is already active.": "Course is already inactive.");
                    return;
                }
                course.setActive(active);

                System.out.println(active ? "Course activated successfully!": "Course deactivated successfully!");
                return;
                }
            }
        System.out.println("Course not found!");
    }

    public void listOfCourses() {
        if (courseList.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }

        for (Course course : courseList) {
            System.out.println(
                "ID: " + course.getId()
                + ", Name: " + course.getCourseName()
                + ", Description: " + course.getDescription()
                + ", Duration: " + course.getDurationInWeeks() + " weeks"
                + ", Active: " + course.isActive()
            );
        }
    }
    
    
}
