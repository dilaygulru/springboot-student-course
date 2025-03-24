package com.boostmytool.WebHomework.Repositories;

import com.boostmytool.WebHomework.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
