package com.game.cricket.service;

import com.game.cricket.entities.Team;

import java.util.List;

public interface TeamService {

    Team saveTeam(Team team);
    Team getTeamById(Long id);
    List<Team> getAllTeams();
}
