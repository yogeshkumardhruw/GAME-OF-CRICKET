package com.game.cricket.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Match {
    @Id
    private Long id;

    private Team team1;

    private List<Object> team1Score;

    private int team1TotalScore;

    private Team team2;

    private List<Object> team2Score;

    private int team2TotalScore;

    private String result;

}
