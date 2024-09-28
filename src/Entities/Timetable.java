package Entities;

import java.sql.Time;

public class Timetable
{
  private int id;
  private Course course;
  private Teacher teacher;
  private String day;
  private Time startTime;
  private Time endTime;
  private String room;

  public Timetable()
  {

  }

  public Timetable( int id, Course course, Teacher teacher, String day, Time startTime, Time endTime, String room )
  {
    this.id = id;
    this.course = course;
    this.teacher = teacher;
    this.day = day;
    this.startTime = startTime;
    this.endTime = endTime;
    this.room = room;
  }

  public int getId()
  {
    return id;
  }

  public void setId( int id )
  {
    this.id = id;
  }

  public Course getCourse()
  {
    return course;
  }

  public void setCourse( Course course )
  {
    this.course = course;
  }

  public Teacher getTeacher()
  {
    return teacher;
  }

  public void setTeacher( Teacher teacher )
  {
    this.teacher = teacher;
  }

  public String getDay()
  {
    return day;
  }

  public void setDay( String day )
  {
    this.day = day;
  }

  public Time getStartTime()
  {
    return startTime;
  }

  public void setStartTime( Time startTime )
  {
    this.startTime = startTime;
  }

  public Time getEndTime()
  {
    return endTime;
  }

  public void setEndTime( Time endTime )
  {
    this.endTime = endTime;
  }

  public String getRoom()
  {
    return room;
  }

  public void setRoom( String room )
  {
    this.room = room;
  }
}
