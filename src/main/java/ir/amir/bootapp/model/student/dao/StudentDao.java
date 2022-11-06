package ir.amir.bootapp.model.student.dao;

import ir.amir.bootapp.model.student.StudentEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentDao extends JpaRepository<StudentEntity , Long> {


    StudentEntity save(StudentEntity studentEntity);

    @Override
    void deleteById(Long aLong);


    @Override
    List<StudentEntity> findAll();

    Optional<StudentEntity> findById(Long id);


//    <S extends StudentEntity>  Optional <List<StudentEntity>> findAll(Example<S> entityExample);


//    <S extends StudentEntity> Optional<S> findOne(Example<S> var1);//

//    <S extends StudentEntity> Iterable<S> findAll(Example<S> var1);


    <S extends StudentEntity> List<S> findAll(Example<S> var1);

}
