package com.study.CRUD_Test.controller;

import com.study.CRUD_Test.dto.LoginDTO;
import com.study.CRUD_Test.dto.SignUpFormDTO;
import com.study.CRUD_Test.service.interfaces.MemberService;
import com.study.CRUD_Test.service.interfaces.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class ApiController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity userSignup(@RequestBody SignUpFormDTO formDTO) {
        return memberService.signup(formDTO);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDTO loginDTO){
        return memberService.login(loginDTO);
    }
}
