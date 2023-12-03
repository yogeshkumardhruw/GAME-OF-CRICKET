package com.game.cricket.service.impl;

import com.game.cricket.dto.AddNewMatchDto;
import com.game.cricket.entities.Match;
import com.game.cricket.repositories.MatchRepository;
import com.game.cricket.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Override
    public Match saveMatch(AddNewMatchDto addNewMatchDto) {
        Match match = new Match();
        match.setId(addNewMatchDto.getId());
        match.setTeam1(addNewMatchDto.getTeam1());
        match.setTeam2(addNewMatchDto.getTeam2());

        return matchRepository.save(match);
    }

    @Override
    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    @Override
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    @Override
    public Match getMatchResults(Long id) {
        Match match = matchRepository.findById(id).get();
        Random random = new Random();

        List<Object> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();
        for(int j=0; j<2; j++) {
            for (int i = 0; i < 12; i++) {
                List<Object> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, "W"));

                Object runs = list.get(random.nextInt(list.size()));
                if(j==0){

                    list2.add(runs);
                }else {
                    list3.add(runs);
                }
                System.out.println("Runs: " + runs);
            }
        }
        match.setTeam1Score(list2);
        match.setTeam2Score(list3);

        int sum1 = list2.stream().filter(i -> i != "W").mapToInt(i -> (int) i).sum();

        match.setTeam1TotalScore(sum1);

        int sum2 = list3.stream().filter(i -> i != "W").mapToInt(i -> (int) i).sum();

        match.setTeam2TotalScore(sum2);

        if(sum1>sum2){
            match.setResult(match.getTeam1()+" WINS");
        }else{
            match.setResult(match.getTeam2()+" WINS");
        }

        return matchRepository.save(match);
    }
}
