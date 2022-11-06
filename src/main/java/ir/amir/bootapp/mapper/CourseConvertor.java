package ir.amir.bootapp.mapper;

import ir.amir.bootapp.model.course.CourseEntity;
import ir.amir.bootapp.model.course.CourseModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseConvertor {

    CourseEntity modelToEntityConvert(CourseModel courseModel);

    CourseModel EntityToModelConvert(CourseEntity courseEntity);

}
