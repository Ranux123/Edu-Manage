package DAOImpl;

import DAO.TeacherDAO;
import Entities.Teacher;

import java.util.List;

public class TeacherDAOImpl implements TeacherDAO
{
  @Override
  public void addTeacher( Teacher teacher )
  {

  }

  @Override
  public Teacher getTeacherById( int teacherId )
  {
    return null;
  }

  @Override
  public List<Teacher> getAllTeachers()
  {
    return List.of();
  }

  @Override
  public void updateTeacher( Teacher teacher )
  {

  }

  @Override
  public void deleteTeacher( int teacherId )
  {

  }

  @Override
  public void paySalary( int teacherId, int salary )
  {

  }

  @Override
  public int getSalaryEarned( int teacherId )
  {
    return 0;
  }
}
