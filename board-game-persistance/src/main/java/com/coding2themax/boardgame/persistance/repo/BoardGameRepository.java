package com.coding2themax.boardgame.persistance.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.coding2themax.boardgame.persistance.model.BoardGame;

public interface BoardGameRepository extends ReactiveCrudRepository<BoardGame, Long> {
}
