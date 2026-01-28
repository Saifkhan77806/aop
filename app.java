package org.example;

import org.example.SpringConfig;
import org.example.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        StudentService service = context.getBean(StudentService.class);

        System.out.println("---- addStudent() ----");
        service.addStudent();

        System.out.println("\n---- getStudentName() ----");
        service.getStudentName();

        System.out.println("\n---- errorMethod() ----");
        try {
            service.errorMethod();
        } catch (Exception e) {
            // ignored
        }
    }
}
