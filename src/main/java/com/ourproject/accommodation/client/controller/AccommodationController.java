package com.ourproject.accommodation.client.controller;

import com.ourproject.accommodation.client.service.AccommodationService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accommodation/*")
@Slf4j
public class AccommodationController {

    @Setter(onMethod_ = @Autowired)
    private AccommodationService accommodationService;
    @GetMapping("/accommodationList")
    public String acList(){
        log.info("acList()호출DD");
        return "accommodation/accommodationList";
    }

    @GetMapping("/accommodationTest")
    public String acTest(){
        log.info("acTest()실행");
        String test = accommodationService.acTest();
        return test;
    }
}
