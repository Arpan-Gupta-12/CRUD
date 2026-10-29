package in.Arg.CRUD.Controller;

import in.Arg.CRUD.Entity.Student;
import in.Arg.CRUD.Service.Student_service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private Student_service studentService;
    public StudentController(Student_service studentService) {
        this.studentService = studentService;
    }



    @RequestMapping("/create")
    public String createStudent(@RequestBody Student student) {

    Student createdStudent= Student_service.createStudent(student);
       return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent.toString());
    }
    public void updateStudent() {
    }
}
