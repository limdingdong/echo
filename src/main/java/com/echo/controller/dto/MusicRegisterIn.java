package com.echo.controller.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class MusicRegisterIn {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

}
