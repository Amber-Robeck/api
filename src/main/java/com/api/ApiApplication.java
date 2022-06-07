package com.api;

import com.api.player.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiApplication.class, args);
	}

	@GetMapping
	public List<Player> hello() {
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
