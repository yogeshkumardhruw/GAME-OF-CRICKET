package com.game.cricket.service;

import com.game.cricket.dto.AddNewMatchDto;
import com.game.cricket.entities.Match;

import java.util.List;

public interface MatchService {

    Match saveMatch(AddNewMatchDto match);
    Match getMatchById(Long id);
    List<Match> getAllMatches();
    Match getMatchResults(Long id);
}
