package org.example.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class StudentAlertService {
    public StudentAlertService() {
        System.out.println("Lazy Singleton");
    }

    public void sendAlert() {
        System.out.println("Sending student alert");
    }
}
