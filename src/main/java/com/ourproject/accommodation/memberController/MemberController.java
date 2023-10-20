package com.ourproject.accommodation.memberController;

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
    public String regist(){
        log.info("POST 회원가입");
        return "";
    }

}
