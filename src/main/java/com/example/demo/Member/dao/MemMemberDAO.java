package com.example.demo.Member.dao;

import com.example.demo.Member.entity.MemMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemMemberDAO extends JpaRepository<MemMember, Long> {
}
