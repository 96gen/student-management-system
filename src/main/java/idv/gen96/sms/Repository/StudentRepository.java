package idv.gen96.sms.Repository;

import idv.gen96.sms.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
