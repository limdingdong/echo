package com.echo.controller.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * 공통응답 해더 클래스
 */
@Getter
@RequiredArgsConstructor
public class ErrorResponse {
    
    private final String code;
    private final String message;

    private final Map<String, String> validation = new HashMap<>();

    public void addValidation(String field, String defaultMessage) {
        validation.put(field, defaultMessage);
    }
}
