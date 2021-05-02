package passmesomesugar.com.github.demo.DataAccessObjects;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import passmesomesugar.com.github.demo.Entity.Student;

import java.util.ArrayList;
import java.util.Collection;

/*In order to make this work one has to establish connection with Data Base.
 * This example is an illustration. It has no real connection with Data Base.*/
@Repository
@Qualifier("mongoData")
public class FakeMongoDBDao implements StudentDao {
  @Override
  public Collection<Student> getAllStudents() {
    return new ArrayList<Student>() {
      {
        add(new Student(1, "Johhny", "Art"));
      }
    };
  }

  @Override
  public Student getStudentById(int id) {
    return null;
  }

  @Override
  public void removeStudentById(int id) {}

  @Override
  public void updateStudent(Student student) {}

  @Override
  public void insertStudentToDB(Student student) {}
}
