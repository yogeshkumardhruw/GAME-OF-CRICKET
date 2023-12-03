package com.game.cricket.dto;

import com.game.cricket.entities.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddNewMatchDto {

        private Long id;
        private Team team1;
        private Team team2;
}
