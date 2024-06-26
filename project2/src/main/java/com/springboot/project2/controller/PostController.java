package com.springboot.project2.controller;

import com.springboot.project2.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/post-api")
public class PostController {
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post API";
    }


    // http://localhost:8080/api/post-api/member
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    // http://localhost:8080/api/post-api/member2
    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDto memberDTO) {
        return memberDTO.toString();
    }
}
