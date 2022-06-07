package com.api.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/player")
public class PlayerController {

    @GetMapping
    public List<Player> getPlayers() {
        return List.of(
                new Player(
                        1L,
                        "Amber",
                        "test22@gmail.com",
                        LocalDate.of(1990, Month.APRIL, 5),
                        32
                )
        );
    }
}
