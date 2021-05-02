package passmesomesugar.com.github.demo.DataAccessObjects;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeStudentImplementationDao implements StudentDao {
  private static Map<Integer, passmesomesugar.com.github.demo.Entity.Student> students;

  static {
    students =
        new HashMap<Integer, passmesomesugar.com.github.demo.Entity.Student>() {
          {
            put(1, new passmesomesugar.com.github.demo.Entity.Student(1, "Wojak", "Physics"));
            put(2, new passmesomesugar.com.github.demo.Entity.Student(2, "AlexDarkStalker", "Linear Algebra"));
            put(3, new passmesomesugar.com.github.demo.Entity.Student(3, "Nebuchadnezzar II", "Management"));
          }
        };
  }

  @Override
  public Collection<passmesomesugar.com.github.demo.Entity.Student> getAllStudents() {
    return students.values();
  }

  @Override
  public passmesomesugar.com.github.demo.Entity.Student getStudentById(int id) {
    return students.get(id);
  }

  @Override
  public void removeStudentById(int id) {
    students.remove(id);
  }

  @Override
  public void updateStudent(passmesomesugar.com.github.demo.Entity.Student student) {
    passmesomesugar.com.github.demo.Entity.Student s = students.get(student.getId());
    s.setCourse(student.getCourse());
    s.setName(student.getName());
    students.put(student.getId(), student);
  }

  @Override
  public void insertStudentToDB(passmesomesugar.com.github.demo.Entity.Student student) {
    students.put(student.getId(), student);
  }
}
