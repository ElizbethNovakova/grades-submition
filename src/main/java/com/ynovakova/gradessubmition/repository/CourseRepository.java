package com.ynovakova.gradessubmition.repository;

import com.ynovakova.gradessubmition.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
