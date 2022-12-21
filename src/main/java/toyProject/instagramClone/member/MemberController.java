package toyProject.instagramClone.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import toyProject.instagramClone.dto.MemberJoinDto;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member/join")
    public Object memberJoin(@Validated @RequestBody MemberJoinDto memberJoinDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.info("검증 오류 발생 errors = {}", bindingResult);
            return bindingResult.getAllErrors();
        }
        Long memberId = memberService.memberJoin(memberJoinDto);
        return memberId;
    }
}
