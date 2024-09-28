package Entities;

public class Teacher
{
  private int teacherID;
  private String teacherName;
  private int salary;
  private int salaryEarned;

  public Teacher( int teacherID, String teacherName, int salary, int salaryEarned )
  {
    this.teacherID = teacherID;
    this.teacherName = teacherName;
    this.salary = salary;
    this.salaryEarned = 0;
  }

  public int getTeacherID()
  {
    return teacherID;
  }

  public void setTeacherID( int teacherID )
  {
    this.teacherID = teacherID;
  }

  public String getTeacherName()
  {
    return teacherName;
  }

  public void setTeacherName( String teacherName )
  {
    this.teacherName = teacherName;
  }

  public int getSalary()
  {
    return salary;
  }

  public void setSalary( int salary )
  {
    this.salary = salary;
  }

  public int getSalaryEarned()
  {
    return salaryEarned;
  }

  public void setSalaryEarned( int salaryEarned )
  {
    this.salaryEarned = salaryEarned;
  }

  public void receiveSalary( int salary )
  {
    this.salaryEarned += salary;
    School.updateTotalMoneySpent( salary );
  }

  @Override
  public String toString()
  {
    return "Teacher's Name: " + teacherName + " | Total Salary Earned so far: $" + salaryEarned;
  }
}
