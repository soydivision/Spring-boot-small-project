package passmesomesugar.com.github.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import passmesomesugar.com.github.demo.Entity.Student;
import passmesomesugar.com.github.demo.Service.StudentService;

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

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteStudentById(@PathVariable("id") int id) {
    studentService.removeStudentById(id);
  }

  @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void updateStudentById(@RequestBody Student student) {
    studentService.updateStudent(student);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void insertStudent(@RequestBody Student student) {
    studentService.insertStudent(student);
  }
}
