package ir.amir.bootapp.api.webRestApis;

import ir.amir.bootapp.mapper.CourseConvertor;
import ir.amir.bootapp.model.course.CourseEntity;
import ir.amir.bootapp.model.course.CourseModel;
import ir.amir.bootapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("courses")
public class CourseRestController {

    @Autowired
    CourseService courseService;

    @Autowired
    CourseConvertor courseConvertor;

    @PostMapping("/save")
    public CourseModel save(@RequestBody CourseModel courseModel){
        System.out.println();
        return courseConvertor.EntityToModelConvert(courseService.save(courseConvertor.modelToEntityConvert(courseModel)));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        try {
            courseService.delete(new CourseEntity(id));
        }catch (Exception e){
            return "course not found";
        }
        return "course deleted";
    }

}
