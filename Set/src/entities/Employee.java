package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;

    protected List<Course> coursesList = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(Course course) {
        coursesList.add(course);
    }

}
