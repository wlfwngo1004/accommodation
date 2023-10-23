package com.ourproject.accommodation.member.controller;

import com.ourproject.accommodation.member.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
@Slf4j
public class MemberController {

    @GetMapping("/registForm")
    public String registForm(){
        log.info("회원가입 폼 호출");
        return "member/registForm";
    }

    @PostMapping("/regist")
    public String regist(MemberDto memberDto) {
        log.info("POST 회원가입");
        log.info("memberDto" + memberDto);
        return "";
    }

    @GetMapping("/loginForm")
    public String loginForm(){
        log.info("로그인 폼 호출");
        return "member/loginForm";
    }
}
