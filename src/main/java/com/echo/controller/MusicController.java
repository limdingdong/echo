package com.echo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @GetMapping("/musics")
    public String get() {
        return "Hello World";
    }
}
