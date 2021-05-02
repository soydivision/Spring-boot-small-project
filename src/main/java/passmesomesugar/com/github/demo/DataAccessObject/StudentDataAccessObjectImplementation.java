package passmesomesugar.com.github.demo.DataAccessObject;

import org.springframework.stereotype.Repository;
import passmesomesugar.com.github.demo.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDataAccessObjectImplementation implements StudentDataAccessObject {
  private static Map<Integer, Student> students;

  static {
    students =
        new HashMap<Integer, Student>() {
          {
            put(1, new Student(1, "Wojak", "Physics"));
            put(2, new Student(2, "AlexDarkStalker", "Linear Algebra"));
            put(3, new Student(3, "Nebuchadnezzar II", "Management"));
          }
        };
  }

  @Override
  public Collection<Student> getAllStudents() {
    return students.values();
  }

  @Override
  public Student getStudentById(int id) {
    return students.get(id);
  }

  @Override
  public void removeStudentById(int id) {
    students.remove(id);
  }

  @Override
  public void updateStudent(Student student) {
    Student s = students.get(student.getId());
    s.setCourse(student.getCourse());
    s.setName(student.getName());
    students.put(student.getId(), student);
  }

  @Override
  public void insertStudentToDB(Student student) {
    students.put(student.getId(), student);
  }
}
