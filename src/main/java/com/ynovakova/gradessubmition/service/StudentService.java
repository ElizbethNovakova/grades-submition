package com.ynovakova.gradessubmition.service;

import com.ynovakova.gradessubmition.entity.Course;
import com.ynovakova.gradessubmition.entity.Student;

import java.util.List;
import java.util.Set;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
    Set<Course> getEnrolledCourses(Long studentId);
}
