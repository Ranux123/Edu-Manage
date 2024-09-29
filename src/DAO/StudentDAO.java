package DAO;

import Entities.Course;
import Entities.Student;

import java.util.List;

public interface StudentDAO
{
  void addStudent( Student student );

  Student gteStudentById( int studentId );

  List<Student> getAllStudents();

  void updateStudent( Student student );

  void deleteStudent( int id );

  void enrollStudentInCourse( int studentId, int courseId );

  List<Course> getEnrolledCourses( int studentId );

  void payFees( int studentId, int amount );

  int getRemainingFees( int studentId );
}
