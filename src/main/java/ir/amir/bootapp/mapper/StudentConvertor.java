package ir.amir.bootapp.mapper;

import ir.amir.bootapp.model.student.StudentEntity;
import ir.amir.bootapp.model.student.StudentModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentConvertor {

    StudentEntity modelToEntityConvert(StudentModel studentModel);

    StudentModel entityToModelConvert(StudentEntity studentEntity);

    List<StudentEntity> modelListToEntityList(List<StudentModel> studentModels);

    List<StudentModel> entityListToModelList(List<StudentEntity> studentEntities);

}
