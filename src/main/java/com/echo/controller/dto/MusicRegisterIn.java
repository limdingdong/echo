package com.echo.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicRegisterIn {

    private String title;
    private String description;

    @Override
    public String toString() {
        return "MusicRegisterIn{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
