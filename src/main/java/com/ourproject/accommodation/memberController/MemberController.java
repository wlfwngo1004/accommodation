package com.ourproject.accommodation.memberController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
@Slf4j
public class MemberController {

    public String registForm(){
        log.info("registForm call");
        return "member/registForm";
    }
}
