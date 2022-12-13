package com.ynovakova.gradessubmition.exceptions;

public class StudentNotEnrolledException extends RuntimeException {
    public StudentNotEnrolledException(Long studentId, Long courseId) {
        super("Student with id " + studentId + ", not enrolled to the course with id " + courseId);
    }
}
