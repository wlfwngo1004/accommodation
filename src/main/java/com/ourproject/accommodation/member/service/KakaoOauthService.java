package com.ourproject.accommodation.member.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ourproject.accommodation.member.dto.SocialUserInfoDto;

public interface KakaoOauthService {

    // "인가 코드"로 "액세스 토큰" 요청
    String getAccessToken(String code) throws JsonProcessingException;

    // 토큰으로 카카오 API 호출
    SocialUserInfoDto getKakaoUserInfo(String accessToken) throws JsonProcessingException;
}
