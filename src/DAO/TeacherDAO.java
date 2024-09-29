package DAO;

import Entities.Teacher;

import java.util.List;

public interface TeacherDAO
{
  void addTeacher( Teacher teacher );

  Teacher getTeacherById( int teacherId );

  List<Teacher> getAllTeachers();

  void updateTeacher( Teacher teacher );

  void deleteTeacher( int teacherId );

  void paySalary( int teacherId, int salary );

  int getSalaryEarned( int teacherId );
}
