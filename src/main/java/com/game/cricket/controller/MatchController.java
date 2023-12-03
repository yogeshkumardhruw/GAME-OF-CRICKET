package com.game.cricket.controller;


import com.game.cricket.dto.AddNewMatchDto;
import com.game.cricket.entities.Match;
import com.game.cricket.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping
    public Match saveMatch(@RequestBody AddNewMatchDto match) {
        return matchService.saveMatch(match);
    }

    @GetMapping("/{id}")
    public Match getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id);
    }

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @GetMapping("/result/{id}")
    public Match getMatchResults(@PathVariable Long id){
        return matchService.getMatchResults(id);
    }
}
