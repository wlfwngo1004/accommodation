package com.ourproject.accommodation.member.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MemberDto {

    private String m_id;
    private String m_name;
    private String m_pwd;
    private String m_phone;
    private String m_mail;
    private String m_addr;
    private Date m_reg_date;
    private int m_lev;

}
