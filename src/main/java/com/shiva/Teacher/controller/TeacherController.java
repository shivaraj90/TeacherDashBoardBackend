package com.shiva.Teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shiva.Teacher.entity.Teacher;
import com.shiva.Teacher.service.TeacherService;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping("/teachers")
    public String listTeachers(Model model){
        List<Teacher> teachers = teacherService.viewTeachers();
        model.addAttribute("teachers",teachers);
        return "teachers";
    }
    

//    @GetMapping
//    public ResponseEntity<List<Teacher>> viewTeachers(){
//        List<Teacher> teachers = teacherService.viewTeachers();
//        return new ResponseEntity<>(teachers, HttpStatus.FOUND);
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<Teacher> teacherById(@PathVariable("id") Long id){
//        Teacher teacher = teacherService.teacherById(id);
//        return ResponseEntity.ok(teacher);
//    }
}
