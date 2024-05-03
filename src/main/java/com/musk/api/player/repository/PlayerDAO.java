package com.musk.api.player.repository;

import com.musk.api.player.model.Player;
import com.musk.api.player.model.PlayerDTO;

import java.util.List;

public interface PlayerDAO {
    List<PlayerDTO> getAllPlayers();
}
