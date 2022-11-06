package ir.amir.bootapp.model.student;

import ir.amir.bootapp.model.course.CourseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH })
    @JoinTable(name = "student_course",
            joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id")})
    private List<CourseEntity> courses;

    public StudentEntity(Long id, String name, List<CourseEntity> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public StudentEntity() {
    }

    public StudentEntity(Long id) {
        this.id = id;
    }

    public StudentEntity(String name) {
        this.name = name;
    }

    public StudentEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentEntity(String name, List<CourseEntity> courses) {
        this.name = name;
        this.courses = courses;
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

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courseEntitySet) {
        this.courses = courseEntitySet;
    }
}
