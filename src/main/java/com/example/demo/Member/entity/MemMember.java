package com.example.demo.Member.entity;


import com.example.demo.Member.enums.MemMemberType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "MEM_MEMBER")
@Getter @Setter
public class MemMember {

    @Id
    @SequenceGenerator(name = "MemMember", sequenceName = "MEM_MEMBER_ID_SEQ")
    @GeneratedValue(generator = "MemMember")
    private Long id;

    @Column(name = "NAME", length = 40, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 40, nullable = false)
    private String surname;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ADDRESS", length = 100)
    private String address;

    @Column(name = "PHONE", length = 11)
    private Long phone;

    @Column(name = "EMAIL", length = 40, nullable = false, unique = true)
    private String email;

    @Column(name = "TYPE", length = 40)
    @Enumerated(EnumType.STRING)
    private MemMemberType type;

}
