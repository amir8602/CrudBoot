package ir.amir.bootapp.service;

import ir.amir.bootapp.model.student.StudentEntity;
import org.springframework.data.domain.Example;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentEntity save(StudentEntity studentEntity);

    void delete(StudentEntity studentEntity);

    StudentEntity update(StudentEntity studentEntity);

    List<StudentEntity> getAll();

    Optional<StudentEntity> getById(StudentEntity studentEntity);


    List<StudentEntity> searchByExample(Example<StudentEntity> entityExample);

}
