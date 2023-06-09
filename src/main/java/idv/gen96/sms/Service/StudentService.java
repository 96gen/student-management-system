package idv.gen96.sms.Service;

import idv.gen96.sms.DTO.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getAllStudents();

    void createStudent(StudentDTO studentDTO);

    StudentDTO getStudentById(long studentId);

    void updateStudent(StudentDTO studentDTO);

    void deleteStudent(long studentId);
}
