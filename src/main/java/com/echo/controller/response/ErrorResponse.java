package com.echo.controller.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 공통응답 해더 클래스
 */
@Getter
@RequiredArgsConstructor
public class ErrorResponse {
    
    private final String code;
    private final String message;
}
