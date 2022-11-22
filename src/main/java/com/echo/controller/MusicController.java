package com.echo.controller;

import com.echo.controller.dto.MusicRegisterIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class MusicController {

    @PostMapping("/musics")
    public String post(@RequestBody @Valid MusicRegisterIn registerIn) throws Exception {
        log.info("registerIn={}", registerIn.toString());
        return "Hello World";
    }

    @GetMapping("/musics")
    public String get() {
        return "Hello World";
    }
}
