package ir.amir.bootapp.model.student;

import ir.amir.bootapp.model.course.CourseModel;

import java.util.List;


public class StudentModel {

    private Long id;
    private String name;

    private List<CourseModel> courses;


    public StudentModel(Long id, String name, List<CourseModel> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }


    public StudentModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentModel(String name) {
        this.name = name;
    }

    public StudentModel(Long id) {
        this.id = id;
    }

    public StudentModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseModel> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseModel> courses) {
        this.courses = courses;
    }

//    public Set<CourseModel> getCourseModelSet() {
//        return courseModelSet;
//    }
//
//    public void setCourseModelSet(Set<CourseModel> courseModelSet) {
//        this.courseModelSet = courseModelSet;
//    }
}
