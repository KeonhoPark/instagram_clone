package toyProject.instagramClone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import toyProject.instagramClone.member.MemberRepository;

@SpringBootApplication
public class InstagramCloneApplication {

	@Profile("local")
	public static void main(String[] args) {
		SpringApplication.run(InstagramCloneApplication.class, args);
	}

	@Bean
	public TestDataInit testDataInit(MemberRepository memberRepository) {
		return new TestDataInit(memberRepository);
	}

}
