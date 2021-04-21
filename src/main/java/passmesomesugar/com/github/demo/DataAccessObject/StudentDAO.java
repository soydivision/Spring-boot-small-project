package passmesomesugar.com.github.demo.DataAccessObject;

import passmesomesugar.com.github.demo.Entity.Student;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentDAO {
  private static Map<Integer, Student> students;

  static {
    students =
        new HashMap<Integer, Student>() {
          {
            put(1, new Student(1, "Wojak", "Physics"));
            put(2, new Student(2, "AlexDarkStalker", "Linear Algebra"));
            put(3, new Student(3, "Nebuchadnezzar II", "PT"));
          }
        };
  }

  public Collection<Student> getAllStudents() {
    return this.students.values();
  }
}
