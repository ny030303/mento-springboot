package com.springboot.project3.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get-api")
public class GetController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    // http://localhost:8080/api/get-api/hello
    @Tag(name = "예제 API", description = "Swagger 테스트용 API")
    @Operation(summary = "헬로", description = "헬로월드를 프린트합니다.")
    @Parameter(name = "str", description = "문자열")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World";
    }

    // http://localhost:8080/api/get-api/name
    @GetMapping(value = "/name")
    public String getName() {
        log.trace("TRACE 로그!!");
        log.debug("DEBUG 로그!!");
        log.info("INFO 로그!!");
        log.warn("WARN 로그!!");
        log.error("ERROR 로그!!");

        return "cat";
    }

    // http://localhost:8080/api/get-api/variable1/{String 값}

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/api/get-api/variable2/{String 값}
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    // http://localhost:8080/api/get-api/request2?name=cat&email=ny030303@gmail.com
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email) {
        return name + " " + email;
    }

    // http://localhost:8080/api/get-api/request2?name=cat&email=ny030303@gma
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(mp -> {
            sb.append(mp.getKey()+ " : "+mp.getValue()+"\n");
        });
        return sb.toString();
    }
}
