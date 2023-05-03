package idv.gen96.sms.Controller;

import idv.gen96.sms.DTO.StudentDTO;
import idv.gen96.sms.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    //GET http://localhost:8080/students
    //取得全部的學生
    @GetMapping("/students")
    public String listStudents(Model model){
        List<StudentDTO> students = studentService.getAllStudents();
        //將students傳遞給前端
        model.addAttribute("students", students);
        //顯示templates/students.html
        return "students";
    }
}
