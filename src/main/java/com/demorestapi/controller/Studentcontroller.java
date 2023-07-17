package com.demorestapi.controller;

import com.demorestapi.bean.Student;
import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Studentcontroller {
    
    // No Db has Used

//    Get http Request
//    http://localhost:8080/Student
    @GetMapping("/Student")
    public ResponseEntity<Student> getStudent() {

        Student student = new Student(
                "shaikh",
                "shaikh",
                10
        );

        return ResponseEntity.ok(student);
    }



    //    http://localhost:8080/Students
    @GetMapping("/Students")
    public  List<Student> getStudents () {

        List<Student> students = new ArrayList<>();

        students.add( new Student("ali","shaikh",1));
        students.add(new Student("ramesh","suresh",2));
        students.add(new Student("sayyed","sajjad",3));

        return students;
    }


//    Spring BOOT REST API Path Variable
//    {id} - URI template variable
//    http://localhost:8080/Student/salman/khan/1

    @GetMapping("/Student/{first-name}/{last-name}/{id}")
    public Student studentNamePathVariable(@PathVariable("first-name") String firstname,
                                           @PathVariable("last-name") String lastname,
                                           @PathVariable("id") int id ){

        return new Student(firstname,lastname,id);
    }



//    Spring BOOT REST-API with RequestParam
//    http://localhost:8080/Students/query?id=12&firstname=ramesh&lastname=suresh
    @GetMapping("Students/query")
    public Student studentRequestparam(@RequestParam int id,@RequestParam String firstname,@RequestParam String lastname) {

        return  new Student(firstname,lastname,id);
    }


//     REST API Spring-BOOT That handles Post request -Creating New Resource
//    PostMapping & RequestBody

//    http://localhost:8080/Students/create
    @PostMapping("Students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent( @RequestBody Student student){

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getID());

        return student;
    }



//    REST API Spring-BOOT That handles Put request - Updating Existing Record
//    http://localhost:8080/Students/9/update
    @PutMapping("Students/{id}/update")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentID){

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

        return student;
    }



//    REST API Spring-BOOT That handles DELETE request - DELETING  Record
//    http://localhost:8080/Students/9/delete
    @DeleteMapping("Students/{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentid){

        System.out.println(studentid);
        return new ResponseEntity<>("student has been deleted Successfully",HttpStatus.OK);
    }

}
