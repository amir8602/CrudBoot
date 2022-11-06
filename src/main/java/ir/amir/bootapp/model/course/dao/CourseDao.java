package ir.amir.bootapp.model.course.dao;

import ir.amir.bootapp.model.course.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<CourseEntity , Long> {

    @Override
    CourseEntity save(CourseEntity courseEntity);

    @Override
    void deleteById(Long aLong);



}
