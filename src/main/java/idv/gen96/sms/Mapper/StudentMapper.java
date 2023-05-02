package idv.gen96.sms.Mapper;

import idv.gen96.sms.DTO.StudentDTO;
import idv.gen96.sms.Entity.Student;

public class StudentMapper {
    //將Student轉換成StudentDTO
    public static StudentDTO mapToStudentDTO(Student student){
        StudentDTO studentDTO = new StudentDTO(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
        return studentDTO;
    }

    //將StudentDTO轉換成Student
    public static  Student mapToStudent(StudentDTO studentDTO){
        Student student = new Student(
                studentDTO.getId(),
                studentDTO.getFirstName(),
                studentDTO.getLastName(),
                studentDTO.getEmail()
        );
        return student;
    }
}
