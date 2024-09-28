package Entities;

public class Attendance
{
  private int id;
  private Student student;
  private Course course;
  private String date;
  private boolean isPresent;

  public Attendance( int id, Student student, Course course, String date, boolean isPresent )
  {
    this.id = id;
    this.student = student;
    this.course = course;
    this.date = date;
    this.isPresent = true;
  }
}


