package com.MyFavorite.StudentManagement;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Repository
public class StudentRepository {
    HashMap<Integer,Student> database = new HashMap<>();
    public String addStudent(Student student){
        if(student==null)
            return "Opps! There is no student.";
        int admissionNo = student.getAdmissionNo();
        database.put(admissionNo,student);
        return "Student has been added.";
    }

    public  Student getStudent(int admissionNo){
        if(!database.containsKey(admissionNo)){
            System.out.println("Opps! Invalid Admission No.");
            return null;
        }
        return database.get(admissionNo);
    }

    public  String updateStudent(int admissionNo, int age){
        if(!database.containsKey(admissionNo)){
            return "Opps! Invalid Admission No.";
        }
        Student student = database.get(admissionNo);
        student.setAge(age);
        database.put(admissionNo,student);
        //database.get(admissionNo).setAge(25);
        return "Student's data has been updated successfully.";
    }
    public String deleteStudent(int admissionNo){
        if(!database.containsKey(admissionNo)){
            return "Opps! Invalid Admission No.";
        }
        database.remove(admissionNo);
        return "Student has been terminated.";
    }
}
