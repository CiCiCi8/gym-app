package com.gym.gymapp.service;

import com.gym.gymapp.entity.Member;
import com.gym.gymapp.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public List<Member> getAll() {
        return repository.findAll();
    }

    public Member save(Member member) {
        return repository.save(member);
    }
}