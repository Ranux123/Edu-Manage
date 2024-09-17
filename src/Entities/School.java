package Entities;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Department> departments;
    private List<Course> courses;
    private TimeTable timeTable;
    private static int totalMoneyEarned = 0;
    private static int totalMoneySpent = 0;

    public School(List<Teacher> teachers, List<Student> students, List<Department> departments, List<Course> courses, TimeTable timeTable) {
        this.teachers = teachers;
        this.students = students;
        this.departments = departments;
        this.courses = courses;
        this.timeTable = timeTable;
    }

    // Add a single teacher to the list
    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            teachers.add(teacher);
        }
    }

    // Get the list of all teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // Add a single student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get the list of all students
    public List<Student> getStudents() {
        return students;
    }

    // Get the list of all departments
    public List<Department> getDepartments() {
        return departments;
    }

    // Set the list of departments
    public void addDepartments(Department department) {
        departments.add(department);
    }

    // Get the list of all courses
    public List<Course> getCourses() {
        return courses;
    }

    // Set the list of courses
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    // Get the timetable
    public TimeTable getTimeTable() {
        return timeTable;
    }

    // Set the timetable
    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    // Get the total money earned by the school
    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // Update the total money earned by the school
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    // Get the total money spent by the school
    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // Update the total money spent by the school
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}
