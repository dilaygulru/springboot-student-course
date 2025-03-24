package com.boostmytool.WebHomework.Controllers;

import com.boostmytool.WebHomework.DTOs.RegisterView;
import com.boostmytool.WebHomework.Exceptions.ResourceNotFoundException;
import com.boostmytool.WebHomework.Models.Course;
import com.boostmytool.WebHomework.Models.Student;
import com.boostmytool.WebHomework.Models.StudentCourse;
import com.boostmytool.WebHomework.Repositories.CourseRepository;
import com.boostmytool.WebHomework.Repositories.StudentCourseRepository;
import com.boostmytool.WebHomework.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrations")
public class StudentCourseController {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<StudentCourse> getAllRegistrations() {
        return studentCourseRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentCourse> getRegistration(@PathVariable int id) {
        StudentCourse registration = studentCourseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Registration not found with id: " + id));
        return ResponseEntity.ok(registration);
    }

    @PostMapping
    public ResponseEntity<StudentCourse> createRegistration(@RequestBody RegisterView view) {
        Student student = studentRepository.findById(view.getStudent().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        Course course = courseRepository.findById(view.getCourse().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Course not found"));

        StudentCourse registration = new StudentCourse();
        registration.setStudent(student);
        registration.setCourse(course);
        registration.setSemester(view.getSemester());
        registration.setRegister_date(view.getRegister_date());

        return ResponseEntity.ok(studentCourseRepository.save(registration));
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentCourse> updateRegistration(@PathVariable int id, @RequestBody RegisterView view) {
        StudentCourse registration = studentCourseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Registration not found"));

        Student student = studentRepository.findById(view.getStudent().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        Course course = courseRepository.findById(view.getCourse().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Course not found"));

        registration.setStudent(student);
        registration.setCourse(course);
        registration.setSemester(view.getSemester());
        registration.setRegister_date(view.getRegister_date());

        return ResponseEntity.ok(studentCourseRepository.save(registration));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRegistration(@PathVariable int id) {
        StudentCourse registration = studentCourseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Registration not found"));

        studentCourseRepository.delete(registration);
        return ResponseEntity.ok().build();
    }
}
