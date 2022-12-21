package toyProject.instagramClone.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toyProject.instagramClone.dto.MemberJoinDto;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {

    private final MemberRepository memberRepository;

    public Long memberJoin(MemberJoinDto memberJoinDto) {
        Member newMember = new Member(memberJoinDto.getName(),
                memberJoinDto.getNickName(),
                memberJoinDto.getPassword(),
                memberJoinDto.getPhoneNumber(),
                memberJoinDto.getEmail(),
                memberJoinDto.getBirthday(),
                memberJoinDto.getProfileImgUrl(),
                memberJoinDto.getWebsiteUrl(),
                memberJoinDto.getIntroduction());

        log.info("memberJoinDto.getBirthday() = {}", memberJoinDto.getBirthday());

        Member saveMember = memberRepository.save(newMember);
        return saveMember.getMemberId();
    }
}
