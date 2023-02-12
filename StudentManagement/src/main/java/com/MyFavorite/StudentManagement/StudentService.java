package com.MyFavorite.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student){
        return studentRepository.addStudent(student);
    }
    public Student getStudent(int admissionNo){
        return studentRepository.getStudent(admissionNo);
    }
    public String updateStudent(int admissionNo, int age){
        return studentRepository.updateStudent(admissionNo,age);
    }
    public String deleteStudent(int admissionNo){
        return studentRepository.deleteStudent(admissionNo);
    }
}
