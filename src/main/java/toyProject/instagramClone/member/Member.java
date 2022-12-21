package toyProject.instagramClone.member;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;
    private String name;

    @Column(name = "NICKNAME")
    private String nickName;

    private String password;
    private String phoneNumber;
    private String email;

    private LocalDate birthday;

    @Column(name = "PROFILE_IMG_URL")
    private String profileImgUrl;

    private Enum status;

    private String websiteUrl;

    @Lob
    private String introduction;

    @CreationTimestamp
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    public Member(String name, String nickName, String password, String phoneNumber, String email, LocalDate birthday, String profileImgUrl, String websiteUrl, String introduction) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.profileImgUrl = profileImgUrl;
        this.websiteUrl = websiteUrl;
        this.introduction = introduction;
    }
}
