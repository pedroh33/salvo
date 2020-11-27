package com.codeoftheweb.salvo.dto;

import com.codeoftheweb.salvo.model.Game;
import com.codeoftheweb.salvo.model.GamePlayer;
import com.codeoftheweb.salvo.model.Player;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;



    public class GameDto {

        private Game game;
        private GamePlayerDto gamePlayerDTO;

        public GameDto(Game game) {
            this.game = game;
        }

        public Map<String, Object> makeGameDTO() {
            Map<String, Object> dto = new LinkedHashMap<>();

            dto.put("id", this.game.getId());
            dto.put("created", this.game.getCreationDate());
            dto.put("gamePlayers", this.game.getGamePlayers()
                    .stream()
                    .map(gamePlayer -> {
                        GamePlayerDto gamePlayerDTO = new GamePlayerDto(gamePlayer);
                        return gamePlayerDTO.makeGamePlayerDTO();
                    })
                    .collect(Collectors.toList()));

            return dto;
        }

    }


