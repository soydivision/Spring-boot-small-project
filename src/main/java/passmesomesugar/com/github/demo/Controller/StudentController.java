package passmesomesugar.com.github.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import passmesomesugar.com.github.demo.Entity.Student;
import passmesomesugar.com.github.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

  @Autowired private StudentService studentService;

  @RequestMapping(method = RequestMethod.GET)
  public Collection<Student> getAllStudents() {
    return studentService.getAllStudents();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Student getStudentById(@PathVariable("id") int id) {
    return studentService.getStudentById(id);
  }
}
