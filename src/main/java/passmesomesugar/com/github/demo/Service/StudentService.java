package passmesomesugar.com.github.demo.Service;

import passmesomesugar.com.github.demo.DataAccessObject.StudentDAO;
import passmesomesugar.com.github.demo.Entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;

@Service
public class StudentService {
  
  @Autowired 	
  private StudentDAO studentDao;

  public Collection<Student> getAllStudents() {
    return studentDao.getAllStudents();
  }
}
