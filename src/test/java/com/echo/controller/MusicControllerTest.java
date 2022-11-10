package com.echo.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MusicControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("/musics 요청 시 Hello World를 출력한다.")
    void test() throws Exception {
        // expected
        mockMvc.perform(get("/musics"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"))
                .andDo(print());
    }
}
