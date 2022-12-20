package toyProject.instagramClone;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import toyProject.instagramClone.member.Member;
import toyProject.instagramClone.member.MemberRepository;

@Slf4j
@RequiredArgsConstructor
public class TestDataInit {

    private final MemberRepository memberRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        log.info("test data init");
        //memberRepository.save(new Member("name1"));
    }
}
