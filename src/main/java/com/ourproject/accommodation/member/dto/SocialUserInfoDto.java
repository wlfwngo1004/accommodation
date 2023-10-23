package com.ourproject.accommodation.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SocialUserInfoDto {
    private Long id;
    private String nickname;
    private String email;

}
