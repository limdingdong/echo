package com.echo.service;

import com.echo.controller.request.MusicRegisterIn;
import com.echo.domain.Music;
import com.echo.repository.MusicRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MusicService {

    private final MusicRepository repository;

    public void registerMusic(MusicRegisterIn registerIn) {
        Music music = new Music(registerIn.getTitle(), registerIn.getDescription());
        repository.save(music);
    }
}
