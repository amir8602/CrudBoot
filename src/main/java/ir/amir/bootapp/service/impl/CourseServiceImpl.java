package ir.amir.bootapp.service.impl;

import ir.amir.bootapp.model.course.CourseEntity;
import ir.amir.bootapp.model.course.dao.CourseDao;
import ir.amir.bootapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public CourseEntity save(CourseEntity courseEntity) {
        return courseDao.save(courseEntity);
    }

    @Override
    public void delete(CourseEntity courseEntity) {
        courseDao.deleteById(courseEntity.getId());
    }


}
