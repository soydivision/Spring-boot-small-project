package passmesomesugar.com.github.demo.DataAccessObject;

import passmesomesugar.com.github.demo.Entity.Student;

import java.util.Collection;

public interface StudentDataAccessObject {
  Collection<Student> getAllStudents();

  Student getStudentById(int id);

  void removeStudentById(int id);

  void updateStudent(Student student);

  void insertStudentToDB(Student student);
}
