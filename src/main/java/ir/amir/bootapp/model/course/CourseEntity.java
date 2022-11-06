package ir.amir.bootapp.model.course;

import javax.persistence.*;

@Entity
@Table(name = "course")

public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public CourseEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CourseEntity(Long id) {
        this.id = id;
    }

    public CourseEntity(String name) {
        this.name = name;
    }

    public CourseEntity() {
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
}
