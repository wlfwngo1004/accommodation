package com.ourproject.accommodation.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberMapperTest {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    void getCnt() {
        int cnt = memberMapper.getCnt();
        assertThat(cnt).isEqualTo(1);
    }

}