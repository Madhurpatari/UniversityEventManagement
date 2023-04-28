package com.Geekster.UniversityEventManager.Controller;

import com.Geekster.UniversityEventManager.Model.Enum.Department;
import com.Geekster.UniversityEventManager.Model.Student;
import com.Geekster.UniversityEventManager.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    //add a student
    @PostMapping
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){
        Student savedStudent = studentService.addStudent(student);
        return  new ResponseEntity<>(savedStudent, HttpStatus.CREATED);

    }

    //update student department
    @PutMapping(value = "/{id}")
    public ResponseEntity<Student> updateStudentDepartment(@PathVariable Integer id, @RequestParam Department department){
        return studentService.updateStudentDepartment(id, department);
    }

    //Delete student
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }

    //get all students
    @GetMapping
    public ResponseEntity<List<Student>>  getAllStudents(){
        return studentService.getAllStudents();
    }

    //get student by id
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }
}
