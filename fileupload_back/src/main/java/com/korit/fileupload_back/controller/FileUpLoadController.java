package com.korit.fileupload_back.controller;

import com.korit.fileupload_back.dto.RequestFileUpLoadDto;
import com.korit.fileupload_back.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

public class FileUpLoadController {

    private MemberService memberService;

    @PostMapping("/api/upload")
    @CrossOrigin
    public ResponseEntity<?> upload(@RequestAttribute RequestFileUpLoadDto dto){
        //오류 잡기 -데이터가 잘들어 오는지
        System.out.println(dto);
        return ResponseEntity.ok(memberService.addMember(dto));
    }
    
}
