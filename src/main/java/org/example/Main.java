package org.example;

import org.example.config.AppConfig;
import org.example.model.Student;
import org.example.service.StudentService;
import org.example.singleton.StudentAlertService;
import org.example.singleton.StudentReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentReportService reportService = context.getBean(StudentReportService.class);
        reportService.generateReport();

        StudentService primaryService = context.getBean(StudentService.class);
        System.out.println("\nStudents from Primary Service:");
        for (Student student : primaryService.getStudents()) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }

        StudentAlertService alertService = context.getBean(StudentAlertService.class);
        alertService.sendAlert();

        StudentService alternativeService = context.getBean("alternativeService", StudentService.class);
        System.out.println("\nStudents from Alternative Service:");
        for (Student student : alternativeService.getStudents()) {
            System.out.println("Name: " + student.getName());
        }

        context.close();
    }
}