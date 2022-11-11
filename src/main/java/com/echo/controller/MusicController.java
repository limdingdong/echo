package com.echo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MusicController {

    @PostMapping("/musics")
    public String post(@RequestParam String title, @RequestParam String desc) {
        log.info("title={}, desc={}", title, desc);
        return "Hello World";
    }

    @GetMapping("/musics")
    public String get() {
        return "Hello World";
    }
}
