package in.Arg.CRUD.Service;

import in.Arg.CRUD.Entity.Student;
import in.Arg.CRUD.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Student_service {

    private StudentRepository studentRepository;

    public Student_service(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentreq){
    Student studentresp = StudentRepository.save(studentreq);
    return studentresp;
    }

}
