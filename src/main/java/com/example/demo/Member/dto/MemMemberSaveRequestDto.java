package com.example.demo.Member.dto;

import com.example.demo.Member.enums.MemMemberType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

@Data
public class MemMemberSaveRequestDto {

    private String name;
    private String surname;
    private String password;
    private String email;

}

