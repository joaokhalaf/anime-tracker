package com.github.joaokhalaf.anime_tracker.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.joaokhalaf.anime_tracker.model.Anime;



@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {
    Optional<Anime> findByMalId(Long malId);
    boolean existsByMalId(Long malId);
}
