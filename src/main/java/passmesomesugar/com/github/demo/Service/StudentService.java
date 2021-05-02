package passmesomesugar.com.github.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import passmesomesugar.com.github.demo.DataAccessObjects.*;
import passmesomesugar.com.github.demo.Entity.Student;

import java.util.Collection;

@Service
public class StudentService {

  @Autowired
  @Qualifier("mongoData")
  private StudentDao studentDao;

  public Collection<Student> getAllStudents() {
    return studentDao.getAllStudents();
  }

  public Student getStudentById(int id) {
    return studentDao.getStudentById(id);
  }

  public void removeStudentById(int id) {
    this.studentDao.removeStudentById(id);
  }

  public void updateStudent(Student student) {
    studentDao.updateStudent(student);
  }

  public void insertStudent(Student student) {
    this.studentDao.insertStudentToDB(student);
  }
}
