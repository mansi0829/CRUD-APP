package service;

import org.springframework.beans.factory.annotation.Autowired;
import repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
