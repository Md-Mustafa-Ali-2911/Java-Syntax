import java.util.*;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Student extends Person {
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(int id, String name) {
        super(id, name);
    }

    public void enrolledCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void showCourses() {
        System.out.println(getName() + " enrolled in :");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.getName());
        }
    }

}

class Teacher extends Person {
    private List<Course> teachesCourse = new ArrayList<>();

    public Teacher(int id, String name) {
        super(id, name);
    }

    public void assignCourse(Course course) {
        teachesCourse.add(course);
    }

    public void showCourses() {
        System.out.println(getName() + " teaches : ");
        for (Course c : teachesCourse) {
            System.out.println(" - " + c.getName());
        }
    }
}

class Course {
    private int id;
    private String name;
    private Teacher teacher; // Composition

    public Course(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}

public class Project {

    public static void main(String args[]) {
        Teacher t1 = new Teacher(1, "Dr. Smith");
        Course c1 = new Course(101, "Maths", t1);
        Course c2 = new Course(102, "Physics", t1);
        t1.assignCourse(c1);
        t1.assignCourse(c2);

        Student s1 = new Student(201, "Alice");
        Student s2 = new Student(202, "Bob");

        s1.enrolledCourse(c1);
        s1.enrolledCourse(c2);

        s2.enrolledCourse(c2);

        t1.showCourses();
        s1.showCourses();
        s2.showCourses();
    }
}