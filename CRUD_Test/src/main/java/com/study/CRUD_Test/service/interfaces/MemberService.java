package com.study.CRUD_Test.service.interfaces;

import com.study.CRUD_Test.dto.LoginDTO;
import com.study.CRUD_Test.dto.SignUpFormDTO;
import org.springframework.http.ResponseEntity;

public interface MemberService {
    ResponseEntity signup(SignUpFormDTO formDTO);
    ResponseEntity login(LoginDTO loginDTO);
}
