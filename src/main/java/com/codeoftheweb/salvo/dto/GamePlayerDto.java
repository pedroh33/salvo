package com.codeoftheweb.salvo.dto;

import com.codeoftheweb.salvo.model.GamePlayer;
import com.codeoftheweb.salvo.model.Player;
import com.codeoftheweb.salvo.model.Salvo;

import java.util.*;
import java.util.stream.Collectors;

public class GamePlayerDto {

    private GamePlayer gamePlayer;

    public GamePlayerDto(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }


    public GamePlayerDto() {
    }

    public Map<String, Object> makeGamePlayerDTO() {
        Map<String, Object> dto = new LinkedHashMap<>();
        PlayerDto playerDTO = new PlayerDto(gamePlayer.getPlayer());
        dto.put("id", this.gamePlayer.getId());
        dto.put("player", playerDTO.makePlayerDTO());

        return dto;
    }

    public Map<String,  Object> makeGameViewDTO(){
        Map<String, Object> dto = new LinkedHashMap<>();
        Map<String, Object> hits = new LinkedHashMap<>();
        Set<GamePlayer> gamePlayers = gamePlayer.getGame().getGamePlayers();
        List<Salvo> salvoes = gamePlayers
                .stream()
                .flatMap(gp -> gp.getSalvos().stream())
                .collect(Collectors.toList());

        hits.put("self", new ArrayList<>());
        hits.put("opponent", new ArrayList<>());
        dto.put("id", this.gamePlayer.getGame().getId());
        dto.put("created", this.gamePlayer.getGame().getCreation_date());
        dto.put("gamePlayers", this.gamePlayer.getGame().getGamePlayers()
                .stream()
                .map(gamePlayer -> {
                    GamePlayerDto gamePlayerDTO = new GamePlayerDto(gamePlayer);
                    return gamePlayerDTO.makeGamePlayerDTO();
                })
                .collect(Collectors.toList()));
        dto.put("ships",  this.gamePlayer.getShips().stream().map(ship  -> {
            ShipDto shipDTO = new ShipDto(ship);
            return  shipDTO.makeShipDTO();

        }));
        dto.put("salvoes", salvoes
                .stream()
                .map(salvo -> {
                    SalvoDTO salvoDTO = new SalvoDTO(salvo);
                    return salvoDTO.makeSalvoDTO();
                }).collect(Collectors.toList()));


        dto.put("hits", hits);
        dto.put("gameState", "PLAY");
        return  dto;

    }

    public GamePlayer getGamePlayer() {
        return gamePlayer;
    }

    public void setGamePlayer(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }
}



