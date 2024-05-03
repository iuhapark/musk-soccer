package com.musk.api.player.repository;

import com.musk.api.player.model.Player;
import com.musk.api.player.model.PlayerDTO;
import com.musk.api.player.model.QPlayer;
import com.musk.api.team.model.QTeam;
import com.musk.api.team.model.Team;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.musk.api.player.model.QPlayer.player;

@Repository
@RequiredArgsConstructor
public class PlayerRepositoryImpl implements PlayerRepository2 {
    private final JPAQueryFactory queryFactory;
    private final QPlayer player = QPlayer.player;
    private final QTeam team = QTeam.team;
    @Override
    public List<Player> findAll() {
        List<Player> players = queryFactory
                .selectFrom(player)
                .leftJoin(player.team, team).fetchJoin()
                .distinct()
                .fetch();
        return players;
    }
}