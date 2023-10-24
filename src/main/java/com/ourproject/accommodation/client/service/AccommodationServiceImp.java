package com.ourproject.accommodation.client.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AccommodationServiceImp implements AccommodationService{

    @Override
    public String acTest(){
        log.info("acTest()2 실행");
        return "Some Result";
    }

}
