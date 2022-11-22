package com.echo.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
        // 곡 제목
        // 곡 설명
        
        // expected
        mockMvc.perform(post("/musics")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":  \"제목입니다.\", \"description\": \"설명입니다.\"}")
                )
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"))
                .andDo(print());
    }

    @Test
    @DisplayName("/musics title 값은 필수이다.")
    void titleIsMandatory() throws Exception {
        // expected
        mockMvc.perform(post("/musics")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":  \"\", \"description\": \"설명입니다.\"}")
                )
                .andExpect(status().isOk())
                .andDo(print());
    }

}
