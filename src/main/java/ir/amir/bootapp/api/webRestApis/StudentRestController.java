package ir.amir.bootapp.api.webRestApis;

import ir.amir.bootapp.exception.GlobalException;
import ir.amir.bootapp.mapper.StudentConvertor;
import ir.amir.bootapp.model.student.StudentEntity;
import ir.amir.bootapp.model.student.StudentModel;
import ir.amir.bootapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentConvertor studentConvertor;

    @PostMapping("/save")
    public StudentModel save(@RequestBody StudentModel studentModel) {
        return studentConvertor.entityToModelConvert(studentService.save(studentConvertor.modelToEntityConvert(studentModel)));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        try {
            studentService.delete(new StudentEntity(id));
        } catch (EmptyResultDataAccessException e) {
            return e.getMessage();
        }
        return "student deleted";
    }

    @PutMapping("/update")
    public StudentModel update(@RequestBody StudentModel studentModel) {
        return studentConvertor.entityToModelConvert(studentService.update(studentConvertor.modelToEntityConvert(studentModel)));
    }

    @GetMapping("/getAll")
    public List<StudentModel> getAllStudent() {
        return studentConvertor.entityListToModelList(studentService.getAll());
    }

    @GetMapping("/getById/{id}")
    public StudentModel getById(@PathVariable("id") Long id) {
        return studentConvertor.entityToModelConvert(studentService.getById(studentConvertor.modelToEntityConvert(new StudentModel(id))).orElseThrow(() ->new GlobalException("Student Not Found")));
    }

    @PostMapping("/searchByExample")
    public List<StudentModel> searchByExample(@RequestBody StudentModel studentModel) {
        return studentConvertor.entityListToModelList(studentService.searchByExample(Example.of(studentConvertor.modelToEntityConvert(studentModel))));
    }

}




