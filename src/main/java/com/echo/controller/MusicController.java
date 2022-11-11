package com.echo.controller;

import com.echo.controller.dto.MusicRegisterIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class MusicController {

    /**
     * @RequstParam Map<String, String> params</String,>
      * @param title
     * @param desc
     * @return
     */
    @PostMapping("/musics")
    public String post(@RequestBody MusicRegisterIn registerIn) {
        log.info("registerIn={}", registerIn.toString());
        return "Hello World";
    }

    @GetMapping("/musics")
    public String get() {
        return "Hello World";
    }
}
