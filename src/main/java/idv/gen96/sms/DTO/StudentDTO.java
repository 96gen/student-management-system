package idv.gen96.sms.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private long id;
    //當輸入是空的，就顯示錯誤訊息
    @NotEmpty(message = "Student first name should not be empty")
    private String firstName;
    @NotEmpty(message = "Student last name should not be empty")
    private String lastName;
    @NotEmpty(message = "Student email should not be empty")
    //驗證是否符合Email格式
    @Email
    private String email;
}
