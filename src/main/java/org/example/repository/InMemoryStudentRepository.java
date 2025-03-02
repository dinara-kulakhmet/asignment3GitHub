package org.example.repository;

import org.example.model.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStudentRepository implements StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public InMemoryStudentRepository() {
        students.add(new Student(1, "Dinara", 18));
        students.add(new Student(2, "Zamira", 16));
        students.add(new Student(3, "Alex", 17));
        students.add(new Student(4, "Asel", 19));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}