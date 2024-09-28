package Entities;

import java.util.ArrayList;
import java.util.List;

public class Department
{
  private int id;
  private String name;
  private Teacher headOfDepartment;
  private List<Course> courses;
  private List<Student> students;

  public Department( int id, String name )
  {
    this.id = id;
    this.name = name;
    this.courses = new ArrayList<>();
    this.students = new ArrayList<>();
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public Teacher getHeadOfDepartment()
  {
    return headOfDepartment;
  }

  public List<Course> getCourses()
  {
    return courses;
  }

  public List<Student> getStudents()
  {
    return students;
  }

  public void setHeadOfDepartment( Teacher headOfDepartment )
  {
    this.headOfDepartment = headOfDepartment;
  }
}
