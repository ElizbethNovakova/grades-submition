package com.ynovakova.gradessubmition.repository;

import com.ynovakova.gradessubmition.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
