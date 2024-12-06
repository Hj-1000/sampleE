package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Log4j2
public class HKController {

    @GetMapping("/hk/list")
    public String hkget(){
        log.info("지휘규로그");
        return "hk/list";
    }

}
