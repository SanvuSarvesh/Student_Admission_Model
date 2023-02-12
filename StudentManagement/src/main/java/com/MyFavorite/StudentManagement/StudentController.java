package com.MyFavorite.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
    HashMap<Integer,Student> database = new HashMap<>();

    // Adding the information
    // Entire url :- localhost:8080/endpoint
    @PostMapping("/add_Student")
    public String addStudent(@RequestBody Student student){
        // Communication by layers
        return studentService.addStudent(student);

        // For understanding purpose
//        if(student==null)
//            return "Opps! There is no student.";
//        int admissionNo = student.getAdmissionNo();
//        database.put(admissionNo,student);
//        return "Student has been added.";
    }

    @GetMapping("/get_Student")
    public  Student getStudent(@RequestParam("admissionNo") int admissionNo){

        return studentService.getStudent(admissionNo);
//        if(!database.containsKey(admissionNo)){
//            System.out.println("Opps! Invalid Admission No.");
//            return null;
//        }
//        return database.get(admissionNo);
    }

    @PutMapping("/update_Student")
    public  String updateStudent(@RequestParam("admissionNo") int admissionNo, @RequestParam("age") int age){
//        if(!database.containsKey(admissionNo)){
//            return "Opps! Invalid Admission No.";
//        }
//        Student student = database.get(admissionNo);
//        student.setAge(age);
//        database.put(admissionNo,student);
//        //database.get(admissionNo).setAge(25);
//        return "Student's data has been updated successfully.";


        return studentService.updateStudent(admissionNo,age);


    }
    @DeleteMapping("/delete_Student/{admissionNo}")
    public String deleteStudent(@PathVariable("admissionNo") int admissionNo){
//        if(!database.containsKey(admissionNo)){
//            return "Opps! Invalid Admission No.";
//        }
//        database.remove(admissionNo);
//        return "Student has been terminated.";


        return studentService.deleteStudent(admissionNo);

    }
}
