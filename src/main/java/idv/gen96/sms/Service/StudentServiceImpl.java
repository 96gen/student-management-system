package idv.gen96.sms.Service;

import idv.gen96.sms.DTO.StudentDTO;
import idv.gen96.sms.Entity.Student;
import idv.gen96.sms.Mapper.StudentMapper;
import idv.gen96.sms.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    //取得全部的學生
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        //將entity轉換成DTO
        List<StudentDTO> studentDTOs = students.stream()
                .map((student) -> StudentMapper.mapToStudentDTO(student))
                .collect(Collectors.toList());
        return studentDTOs;
    }

    //創建新學生並儲存
    @Override
    public void createStudent(StudentDTO studentDTO) {
        Student student = StudentMapper.mapToStudent(studentDTO);
        studentRepository.save(student);
    }
}
