package ir.amir.bootapp.service.impl;

import ir.amir.bootapp.model.student.StudentEntity;
import ir.amir.bootapp.model.student.dao.StudentDao;
import ir.amir.bootapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        StudentEntity save = studentDao.save(studentEntity);
        return save;
    }

    @Override
    public void delete(StudentEntity studentEntity) {
        studentDao.deleteById(studentEntity.getId());
    }

    @Override
    public StudentEntity update(StudentEntity studentEntity) {
        return studentDao.save(studentEntity);
    }

    @Override
    public List<StudentEntity> getAll() {
        return studentDao.findAll();
    }

    @Override
    public Optional<StudentEntity> getById(StudentEntity studentEntity) {
        return studentDao.findById(studentEntity.getId());
    }

    @Override
    public List<StudentEntity> searchByExample(Example<StudentEntity> entityExample) {
        return studentDao.findAll(entityExample);
    }
}
