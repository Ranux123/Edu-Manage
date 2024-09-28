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

  public int getId()
  {
    return id;
  }

  public Student getStudent()
  {
    return student;
  }

  public Course getCourse()
  {
    return course;
  }

  public String getDate()
  {
    return date;
  }

  public void setId( int id )
  {
    this.id = id;
  }

  public void setStudent( Student student )
  {
    this.student = student;
  }

  public void setCourse( Course course )
  {
    this.course = course;
  }

  public void setDate( String date )
  {
    this.date = date;
  }

  public boolean isPresent()
  {
    return isPresent;
  }

  public void setPresent( boolean present )
  {
    isPresent = present;
  }
}


