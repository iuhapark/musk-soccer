package com.musk.api.player.repository;

import com.musk.api.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@SuppressWarnings("rawtypes")
@Repository
public interface PlayerRepository extends JpaRepository<Player, String>, PlayerJpqlRepository, PlayerDAO {


}
