package demo_project;

import demo_project.enums.CourseOffer;
import demo_project.enums.Gender;
import demo_project.model.Course;
import demo_project.model.Student;
import demo_project.model.Teacher;
import demo_project.service.impl.TeachableServiceImpl;


public class SchoolSystem {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Okonkwo kennedy", 34, Gender.MALE);
        Teacher teacher2 = new Teacher("Philip Jared", 24, Gender.FEMALE);

        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.NODE);

        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();

        System.out.println("Teacher Data");
        teachableService1.teachCourse(teacher1, course1);
        System.out.println("************************************");

        System.out.println("Teacher Data");
        teachableService2.teachCourse(teacher2, course2);            
        System.out.println("************************************");

        Student student1 = new Student("Okoro kenneth", 24, Gender.MALE);
        Student student2 = new Student("Okoye kate", 14, Gender.FEMALE);

        System.out.println("Student Data");
        teachableService1.takeCourse(student1, course1);
        System.out.println("************************************");

        System.out.println("Student Data");
        teachableService1.takeCourse(student2, course2);
        System.out.println("************************************");
    }
}
