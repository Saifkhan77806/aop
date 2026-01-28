package org.example;

import org.springframework.stereotype.Component;

@Component
public class StudentService {

    public void addStudent() {
        System.out.println("Student added successfully");
    }

    public void deleteStudent() {
        System.out.println("Student deleted successfully");
    }

    public void errorMethod() {
        throw new RuntimeException("Exception occurred!");
    }

    public String getStudentName() {
        return "Faiz";
    }

}
