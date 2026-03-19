package com.gym.gymapp.controller;

import com.gym.gymapp.entity.Member;
import com.gym.gymapp.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service) {
        this.service = service;
    }

    @GetMapping("/getmembers")
    public List<Member> getMembers() {
        return service.getAllMembers();
    }

    @PostMapping("/addmember")
    public Member addMember(@RequestBody Member member) {
        return service.addMember(member);
    }
}