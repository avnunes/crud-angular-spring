package com.avnunes.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.avnunes.enums.Status;
import com.avnunes.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Page<Course> findByStatus(Pageable pageable, Status status);

    List<Course> findByName(String name);

}
