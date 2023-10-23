package com.ourproject.accommodation.member.controller;

import com.ourproject.accommodation.member.service.KakaoOauthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/oauth/*")
@Slf4j
public class KakaoOauthController {

    @Autowired
    private KakaoOauthService kakaoOauthService;

    @GetMapping("/kakaoLogin")
    public String kakaoLogin(@RequestParam("code") String code) throws Throwable {
        log.info("카카오 로그인 호출");
        // 가져온 code 확인
        log.info("code = " + code);
        // 토큰 받아오기
        
        return null;
    }
}
