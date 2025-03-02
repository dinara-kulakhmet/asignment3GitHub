package org.example.singleton;

import org.springframework.stereotype.Component;

@Component
public class StudentReportService {
    public StudentReportService() {
        System.out.println("Eager");
    }

    public void generateReport() {
        System.out.println("Generating report");
    }
}