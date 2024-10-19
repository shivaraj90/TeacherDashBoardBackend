package com.shiva.Teacher.repository;

import com.shiva.Teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
