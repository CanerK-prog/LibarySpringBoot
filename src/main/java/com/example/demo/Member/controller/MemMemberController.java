package com.example.demo.Member.controller;


import com.example.demo.Member.dto.MemMemberSaveRequestDto;
import com.example.demo.Member.entity.MemMember;
import com.example.demo.Member.service.MemMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class MemMemberController {

    private final MemMemberService memberService;

    @GetMapping()
    public ResponseEntity<List<MemMember>> findAll(){
        List<MemMember> memberList = memberService.findAll();
        return ResponseEntity.ok(memberList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemMember> findById(@PathVariable Long id){
        MemMember member = memberService.findById(id);
        return ResponseEntity.ok(member);
    }

    @PostMapping
    public ResponseEntity<MemMember> save(@RequestBody MemMemberSaveRequestDto memMemberSaveRequestDto){
        MemMember member = memberService.save(memMemberSaveRequestDto);
        return ResponseEntity.ok(member);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        memberService.delete(id);
    }
}
