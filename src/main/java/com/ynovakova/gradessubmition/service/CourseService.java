package com.ynovakova.gradessubmition.service;

import com.ynovakova.gradessubmition.entity.Course;

import java.util.List;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
}
