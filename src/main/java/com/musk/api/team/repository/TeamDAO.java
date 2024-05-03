package com.musk.api.team.repository;

import com.musk.api.team.model.Team;
import com.musk.api.team.model.TeamDTO;

import java.util.List;

public interface TeamDAO {
    List<TeamDTO> getAllTeam();
}
