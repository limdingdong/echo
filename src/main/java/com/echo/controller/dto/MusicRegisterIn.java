package com.echo.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class MusicRegisterIn {

    @NotBlank(message = "곡 제목을 입력해 주세요.")
    private String title;

    @NotBlank(message = "곡 설명을 입력해 주세요.")
    private String description;

}
