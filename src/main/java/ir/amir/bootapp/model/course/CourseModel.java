package ir.amir.bootapp.model.course;



public class CourseModel {

    private Long id;

    private String name;


    public CourseModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CourseModel(Long id) {
        this.id = id;
    }

    public CourseModel(String name) {
        this.name = name;
    }

    public CourseModel() {
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

