package com.ourproject.accommodation.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class TestController {
    @RequestMapping("/")
    public String test(){
        log.info("test() 실행");
        return "index";
    }
}
