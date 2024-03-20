package com.driver;

import java.util.ArrayList;

public class CourseRegistrationSystem {
	private ArrayList<Course> courses;

    public CourseRegistrationSystem() {
        // your code goes here
        this.courses=new ArrayList<>();
    }

    public void addCourse(Course course) {
        // your code goes here
        courses.add(course);
    }

    public Course findCourseById(String courseId) {
        //your code goes here
        for (Course course : courses) {
            if (course.getCourseId().trim().equalsIgnoreCase(courseId.trim())) {
                return course;
            }
        }
        return null;
    }
}
