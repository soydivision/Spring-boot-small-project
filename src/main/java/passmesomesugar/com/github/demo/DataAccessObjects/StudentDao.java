package passmesomesugar.com.github.demo.DataAccessObjects;

import java.util.Collection;

public interface StudentDao {
  Collection<passmesomesugar.com.github.demo.Entity.Student> getAllStudents();

  passmesomesugar.com.github.demo.Entity.Student getStudentById(int id);

  void removeStudentById(int id);

  void updateStudent(passmesomesugar.com.github.demo.Entity.Student student);

  void insertStudentToDB(passmesomesugar.com.github.demo.Entity.Student student);
}
