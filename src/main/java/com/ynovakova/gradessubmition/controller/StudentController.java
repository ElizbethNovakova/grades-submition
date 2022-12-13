package com.ynovakova.gradessubmition.controller;

import com.ynovakova.gradessubmition.entity.Course;
import com.ynovakova.gradessubmition.entity.Student;
import com.ynovakova.gradessubmition.service.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        return new ResponseEntity<Student>(studentService.getStudent(id),
                HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student){
        return new ResponseEntity<>(studentService.saveStudent(student),
                HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStudents(@PathVariable Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
    }

    @GetMapping("/{studentId}/courses")
    public ResponseEntity<Set<Course>> getEnrolledCourses(@PathVariable Long studentId){
        return new ResponseEntity<>(studentService.getEnrolledCourses(studentId), HttpStatus.OK);
    }
}
