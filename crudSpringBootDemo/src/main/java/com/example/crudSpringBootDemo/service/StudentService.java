package com.example.crudSpringBootDemo.service;


import com.example.crudSpringBootDemo.entity.Student;
import com.example.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository= studentRepository;
    }

    public Student createStudent(Student studentReq) {
        // business logic
        // store to db

        System.out.println("inside student service");
        Student studentRepo= studentRepository.saveStudent(studentReq);
        System.out.println("Exiting studentservice");
        return studentRepo;


    }
}
