package DAOImpl;

import DAO.StudentDAO;
import Entities.Course;
import Entities.Student;

import java.util.List;

public class StudentDAOImpl implements StudentDAO
{

  @Override
  public void addStudent( Student student )
  {

  }

  @Override
  public Student gteStudentById( int studentId )
  {
    return null;
  }

  @Override
  public List<Student> getAllStudents()
  {
    return List.of();
  }

  @Override
  public void updateStudent( Student student )
  {

  }

  @Override
  public void deleteStudent( int id )
  {

  }

  @Override
  public void enrollStudentInCourse( int studentId, int courseId )
  {

  }

  @Override
  public List<Course> getEnrolledCourses( int studentId )
  {
    return List.of();
  }

  @Override
  public void payFees( int studentId, int amount )
  {

  }

  @Override
  public int getRemainingFees( int studentId )
  {
    return 0;
  }
}
