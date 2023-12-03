package com.game.cricket.repositories;

import com.game.cricket.entities.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, Long> {
}
