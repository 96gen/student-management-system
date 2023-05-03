package idv.gen96.sms.Controller;

import idv.gen96.sms.DTO.StudentDTO;
import idv.gen96.sms.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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

    //GET http://localhost:8080/students/new
    //填寫新學生的資料
    @GetMapping("/students/new")
    public String newStudent(Model model){
        StudentDTO studentDTO = new StudentDTO();
        //將student傳遞給前端
        model.addAttribute("student", studentDTO);
        //顯示templates/create_student.html
        return "create_student";
    }

    //POST http://localhost:8080/students
    //創建儲存學生資訊
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") StudentDTO studentDTO){
        studentService.createStudent(studentDTO);
        return "redirect:/students";
    }
}
