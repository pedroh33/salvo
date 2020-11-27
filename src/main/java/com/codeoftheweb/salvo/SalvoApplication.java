package com.codeoftheweb.salvo;



import com.codeoftheweb.salvo.model.Game;
import com.codeoftheweb.salvo.model.GamePlayer;
import com.codeoftheweb.salvo.model.Player;
import com.codeoftheweb.salvo.model.Ship;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.codeoftheweb.salvo.repository.GamePlayerRepository;
import com.codeoftheweb.salvo.repository.GameRepository;
import com.codeoftheweb.salvo.repository.PlayerRepository;
import com.codeoftheweb.salvo.repository.ShipRepository;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SalvoApplication {
/*
	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);


	}

	@Bean
	public CommandLineRunner initData(PlayerRepository playereRepository,
									  GameRepository gameRepository,
									  GamePlayerRepository gamePlayerRepository,
									  ShipRepository shipRepository
									  ) {
		return (args) -> {

			Player playe1 = new Player("David","david@gmail.com");
			Player playe2 = new Player("Rocket","rocket@gmail.com");

			playereRepository.save(playe1);
			playereRepository.save(playe2);

			Game game1 = new Game();
			Game game2 = new Game();
			game2.setCreationDate(Date.from(game1.getCreationDate().toInstant().plusSeconds(3600)));
			Game game3 = new Game();
			game3.setCreationDate(Date.from(game1.getCreationDate().toInstant().plusSeconds(7200)));

			gameRepository.save(game1);
			gameRepository.save(game2);
			gameRepository.save(game3);

			GamePlayer gamePlayer1 = new GamePlayer(playe1,	game1);
			GamePlayer gamePlayer2 = new GamePlayer(playe2,	game1);

			gamePlayerRepository.save(gamePlayer1);
			gamePlayerRepository.save(gamePlayer2);

			Ship ship1 = new Ship("Carrier",List.of("c1,c2,c3,c4,c5"));
			Ship ship2 = new Ship("Battleship",List.of("f3,f4,f5,f6"));
			Ship ship3 = new Ship("Submarine",List.of("h1,h2,h3"));
			Ship ship4 = new Ship("Destroyer",List.of("d2,d3,d4"));
			Ship ship5 = new Ship("Patrol Boat",List.of("a1,a2"));
			shipRepository.save(ship1);
			shipRepository.save(ship2);
			shipRepository.save(ship3);
			shipRepository.save(ship4);
			shipRepository.save(ship5);


		};

	}

*/



}
