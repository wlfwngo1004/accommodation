package com.ourproject.accommodation.member.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KakaoOauthServiceImp implements KakaoOauthService{


    @Override
    public String getAccessToken(String code) {
        log.info("getAccessToken 메소드 실행");
        return null;
    }
}
