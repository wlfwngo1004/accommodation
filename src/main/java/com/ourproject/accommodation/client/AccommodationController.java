package com.ourproject.accommodation.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accommodation/*")
@Slf4j
public class AccommodationController {

    @GetMapping("/accommodationList")
    public String acList(){
        log.info("acList()호출DD");
        return "accommodation/accommodationList";
    }
}
