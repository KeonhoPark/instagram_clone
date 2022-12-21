package toyProject.instagramClone.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class MemberJoinDto {

    @NotNull @NotBlank
    private String name;
    private String nickName;

    @NotNull @NotBlank
    private String password;

    @NotNull @NotBlank
    private String phoneNumber;

    @NotNull @Email
    private String email;

    @DateTimeFormat(pattern = "yyyy:MM:dd")
    private LocalDate birthday;
    private String profileImgUrl;

    private String websiteUrl;

    private String introduction;


}
