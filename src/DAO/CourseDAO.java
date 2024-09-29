package DAO;

import Entities.Course;

import java.util.List;

public interface CourseDAO
{
  void addCourse( Course course);

  Course getCourse(int courseCode);

  List<Course> getAllCourses();

  void updateCourse( Course course );

  void deleteCourse( int courseCode );
}
