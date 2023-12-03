package com.game.cricket.repositories;

import com.game.cricket.entities.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match, Long> {
}
