package Entities;

import java.util.ArrayList;
import java.util.List;

public class Student
{
  private int id;
  private String name;
  private int grade;
  private Department department;
  private int feesPaid;
  private int feesTotal;
  private List<Course> enrolledCourses;

  public Student( int id, String name, int grade, Department department )
  {
    this.id = id;
    this.name = name;
    this.grade = grade;
    this.department = department;
    this.feesPaid = 0;
    this.feesTotal = 50000;
    this.enrolledCourses = new ArrayList<>();
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public int getGrade()
  {
    return grade;
  }

  public Department getDepartment()
  {
    return department;
  }

  public int getFeesPaid()
  {
    return feesPaid;
  }

  public int getFeesTotal()
  {
    return feesTotal;
  }

  public List<Course> getEnrolledCourses()
  {
    return enrolledCourses;
  }

  public void setGrade( int grade )
  {
    this.grade = grade;
  }

  public void payFees( int fees )
  {
    feesPaid += fees;
    School.updateTotalMoneyEarned( fees );
  }

  public int getRemainingFees()
  {
    return feesTotal - feesPaid;
  }

  public void enrollInCourse( Course course )
  {
    enrolledCourses.add( course );
  }

  @Override
  public String toString()
  {
    return "Student's name: " + name + ", Total fees paid so far: $" + feesPaid;
  }
}
