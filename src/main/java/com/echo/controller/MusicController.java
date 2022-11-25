package com.echo.controller;

import com.echo.controller.request.MusicRegisterIn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class MusicController {

    @PostMapping("/musics")
    public Map<String, String> post(@RequestBody @Valid MusicRegisterIn registerIn, BindingResult result) {
        log.info("registerIn={}", registerIn.toString());
        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            FieldError firstFieldError = fieldErrors.get(0);
            String invalidFieldName = firstFieldError.getField(); // title
            String errorMessage = firstFieldError.getDefaultMessage();// 에러 메시지

            Map<String, String> error = new HashMap<>();
            error.put(invalidFieldName, errorMessage);
            return error;
        }

        return Map.of();
    }

    @PostMapping("/musics/exceptionControl")
    public Map<String, String> exceptionControl(@RequestBody @Valid MusicRegisterIn registerIn) {
        log.info("registerIn={}", registerIn.toString());
        return Map.of();
    }

    @GetMapping("/musics")
    public String get() {
        return "Hello World";
    }
}
