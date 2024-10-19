package com.shiva.Teacher.service;

import com.shiva.Teacher.entity.Teacher;
import com.shiva.Teacher.exceptions.NoResourceFoundException;
import com.shiva.Teacher.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository ;

    public Teacher createTeacher(Teacher teacher){
        Teacher newTeacher = teacherRepository.save(teacher);
        return newTeacher;
    }

    public List<Teacher> viewTeachers(){
        List<Teacher> listTeachers = teacherRepository.findAll();
        return listTeachers;
    }

    public Teacher teacherById(Long id){
        Teacher teacher = teacherRepository.findById(id).orElseThrow(()->
                new NoResourceFoundException("No Teacher found with id : "+id));

        return teacher;
    }
}
