package com.example.demo.Member.service;

import com.example.demo.Member.dao.MemMemberDAO;
import com.example.demo.Member.dto.MemMemberSaveRequestDto;
import com.example.demo.Member.entity.MemMember;
import com.example.demo.Member.enums.MemMemberType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemMemberService {

    private final MemMemberDAO memMemberDAO;

    public List<MemMember> findAll() {
        List<MemMember> memberList = memMemberDAO.findAll();
        return memberList;
    }

    public MemMember findById(Long id) {
        MemMember member = memMemberDAO.findById(id).orElseThrow();
        return member;
    }

    public MemMember save(MemMemberSaveRequestDto memMemberSaveRequestDto) {
        MemMember member = new MemMember();
        member.setName(memMemberSaveRequestDto.getName());
        member.setSurname(memMemberSaveRequestDto.getSurname());
        member.setPassword(memMemberSaveRequestDto.getPassword());
        member.setEmail(memMemberSaveRequestDto.getEmail());
        member.setType(MemMemberType.MEMBER);

        member = memMemberDAO.save(member);
        return member;
    }

    public void delete(Long id) {
        memMemberDAO.deleteById(id);
    }
}
