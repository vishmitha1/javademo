package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    @Autowired

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentBy= studentRepository.findStudentByEmail(student.getEmail());

        if (studentBy.isPresent()){
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exist=studentRepository.existsById(studentId);
        if(!exist){
            throw new IllegalStateException(
                    "Student not exist"+studentId);

        }
        studentRepository.deleteById(studentId);

    }
    @Transactional
    public void updateStudent(Long studentId,String studentname) {
        Student student=studentRepository.findById(studentId).orElseThrow(
                () -> new IllegalStateException("Student id not exist")
        );

        student.setName(studentname);
    }
}
