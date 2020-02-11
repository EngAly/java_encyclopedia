package listOperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CRUD {

    public static final List<Course> courses = new ArrayList();

    static {
        courses.add(new Course(1, "aly ahmed mohamed", "Learn Full stack with Spring Boot and Angular"));
        courses.add(new Course(2, "hossam ommara", "Learn Full stack with Spring Boot and React"));
        courses.add(new Course(44, "mohamed ouf", "Master Microservices with Spring Boot and Spring Cloud"));
        courses.add(new Course(4, "ibrahim trka", "Deploy Spring Boot Microservices to Cloud"));
    }

    public static void main(String[] args) {
        CRUD crud = new CRUD();
        crud.selectAll();
        crud.createCourse(new Course(1, "haderr ahmed", "study commercial"));
        crud.selectAll();

    }

    public void selectAll() {
        for (Iterator<Course> course = courses.iterator(); course.hasNext();) {
            System.out.println(course.next().toString());
        }
    }

    private void deleteById(int id) {
        for (Iterator<Course> course = courses.iterator(); course.hasNext();) {
            if (course.next().getId() == id) {
                course.remove();
            }
        }
    }

    private void updateById(Course newCourse) {
        deleteById(newCourse.getId());
        courses.add(newCourse);
    }

    private void createCourse(Course newCourse) {
        courses.add(newCourse);
    }
}
