package Entities;

import java.util.List;

public class School
{
  private List<Teacher> teachers;
  private List<Student> students;
  private List<Department> departments;
  private List<Course> courses;
  private Timetable timeTable;
  private static int totalMoneyEarned = 0;
  private static int totalMoneySpent = 0;

  public School( List<Teacher> teachers, List<Student> students, List<Department> departments, List<Course> courses, Timetable timeTable )
  {
    this.teachers = teachers;
    this.students = students;
    this.departments = departments;
    this.courses = courses;
    this.timeTable = timeTable;
  }

  public void addTeacher( Teacher teacher )
  {
    if( teacher != null )
    {
      teachers.add( teacher );
    }
  }

  public List<Teacher> getTeachers()
  {
    return teachers;
  }

  public void addStudent( Student student )
  {
    students.add( student );
  }

  public List<Student> getStudents()
  {
    return students;
  }

  public List<Department> getDepartments()
  {
    return departments;
  }

  public void addDepartments( Department department )
  {
    departments.add( department );
  }

  public List<Course> getCourses()
  {
    return courses;
  }

  public void setCourses( List<Course> courses )
  {
    this.courses = courses;
  }

  public Timetable getTimeTable()
  {
    return timeTable;
  }

  public void setTimeTable( Timetable timeTable )
  {
    this.timeTable = timeTable;
  }

  public static int getTotalMoneyEarned()
  {
    return totalMoneyEarned;
  }

  public static void updateTotalMoneyEarned( int moneyEarned )
  {
    totalMoneyEarned += moneyEarned;
  }

  public static int getTotalMoneySpent()
  {
    return totalMoneySpent;
  }

  public static void updateTotalMoneySpent( int moneySpent )
  {
    totalMoneySpent += moneySpent;
  }

  public void setTeachers( List<Teacher> teachers )
  {
    this.teachers = teachers;
  }

  public void setStudents( List<Student> students )
  {
    this.students = students;
  }

  public void setDepartments( List<Department> departments )
  {
    this.departments = departments;
  }

  public static void setTotalMoneyEarned( int totalMoneyEarned )
  {
    School.totalMoneyEarned = totalMoneyEarned;
  }

  public static void setTotalMoneySpent( int totalMoneySpent )
  {
    School.totalMoneySpent = totalMoneySpent;
  }
}
