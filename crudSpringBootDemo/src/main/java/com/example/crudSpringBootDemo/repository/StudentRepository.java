package com.example.crudSpringBootDemo.repository;


import com.example.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {


    public Student saveStudent(Student studentReq) {

        // save to db

        System.out.println("inside student repository");
        System.out.println("Exting student repository");
        Student s1= new Student();
        s1.setName("vinay");
        s1.setAge(20);
        s1.setEmail("vinay@gmail.com");
        s1.setRollNo(149);
        s1.setSubject("spring");
        return s1;


    }
}
