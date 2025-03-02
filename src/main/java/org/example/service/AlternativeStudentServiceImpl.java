package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("alternativeService")
public class AlternativeStudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public AlternativeStudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.getAllStudents();
    }
}