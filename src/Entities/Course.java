package Entities;

public class Course
{
  private String courseName;
  private int courseCode;
  private Department department;

  public Course( int courseCode, String courseName, Department department )
  {
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.department = department;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getCourseCode()
  {
    return courseCode;
  }

  public Department getDepartment()
  {
    return department;
  }

  public void setCourseName( String courseName )
  {
    this.courseName = courseName;
  }

  public void setCourseCode( int courseCode )
  {
    this.courseCode = courseCode;
  }

  public void setCourseName( Department department )
  {
    this.department = department;
  }
}
