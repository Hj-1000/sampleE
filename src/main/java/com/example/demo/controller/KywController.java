package com.example.demo.controller;

import lombok.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
@RequiredArgsConstructor
public class KywController {
    @GetMapping("/kyw/list")
    public String kywGet(){
        log.info("김영우 입니다.");
        return "kyw/list";

    }
}
