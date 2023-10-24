package com.ourproject.accommodation.member.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ourproject.accommodation.member.dto.SocialUserInfoDto;
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
    private final KakaoOauthService kakaoOauthService;

    public KakaoOauthController(KakaoOauthService kakaoOauthService) {
        this.kakaoOauthService = kakaoOauthService;
    }

    @GetMapping("/kakaoLogin")
    public String kakaoLogin(@RequestParam("code") String code) throws JsonProcessingException {

        // 1. "인가 코드"로 "액세스 토큰" 요청
        log.info("code = " + code);
        String accessToken = kakaoOauthService.getAccessToken(code);
        // 2. 토큰으로 카카오 API 호출
        log.info("accessToken = " + accessToken);
        SocialUserInfoDto kakaoUserInfo = kakaoOauthService.getKakaoUserInfo(accessToken);
        log.info("kakaoUserInfo = " + kakaoUserInfo);
        return "";
    }


}
