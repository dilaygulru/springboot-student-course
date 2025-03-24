package com.boostmytool.WebHomework.DTOs;

import com.boostmytool.WebHomework.Models.Course;
import com.boostmytool.WebHomework.Models.Student;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class RegisterView {

    private int id;
    private Course course;
    private Student student;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date register_date;

    private String semester;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
