package ir.amir.bootapp.service;

import ir.amir.bootapp.model.course.CourseEntity;

public interface CourseService {

    CourseEntity save(CourseEntity courseEntity);

    void delete(CourseEntity courseEntity);

}
