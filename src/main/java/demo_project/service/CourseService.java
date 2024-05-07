package demo_project.service;

import demo_project.model.Course;
import demo_project.model.Student;
import demo_project.model.Teacher;

public interface CourseService {

    public void teachCourse(Teacher teacher, Course course);

    public default void takeCourse(Student student, Course course){

    }
}
