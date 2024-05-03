package com.musk.api.team.repository;

import com.musk.api.team.model.QTeam;
import com.musk.api.team.model.Team;
import com.musk.api.team.model.TeamDTO;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
@Service
@RequiredArgsConstructor
public class TeamDAOImpl implements TeamDAO{
    private final JPAQueryFactory queryFactory;
    private final QTeam team = QTeam.team;


    public List<TeamDTO> getAllTeam() {
        return queryFactory
                .select(team.id,
                        team.regionName,
                        team.teamName,
                        team.eTeamName,
                        team.origYyyy,
                        team.zipCode1,
                        team.zipCode2,
                        team.address,
                        team.ddd,
                        team.tel,
                        team.fax,
                        team.homePage,
                        team.owner,
                        team.stadium.id)
                .from(team)
                .fetch()
                .stream()
                .map(tuple -> TeamDTO.builder()
                        .id(tuple.get(team.id))
                        .regionName(tuple.get(team.regionName))
                        .teamName(tuple.get(team.teamName))
                        .eTeamName(tuple.get(team.eTeamName))
                        .origYyyy(tuple.get(team.origYyyy))
                        .zipCode1(tuple.get(team.zipCode1))
                        .zipCode2(tuple.get(team.zipCode2))
                        .address(tuple.get(team.address))
                        .ddd(tuple.get(team.ddd))
                        .tel(tuple.get(team.tel))
                        .fax(tuple.get(team.fax))
                        .homePage(tuple.get(team.homePage))
                        .owner(tuple.get(team.owner))
                        .stadiumId(tuple.get(team.stadium.id))
                        .build())
                .toList();
    }
}
