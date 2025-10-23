package com.github.joaokhalaf.anime_tracker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joaokhalaf.anime_tracker.model.Anime;
import com.github.joaokhalaf.anime_tracker.services.RecommendationService;

@RestController
public class HomeController {


    @Autowired
    private RecommendationService recommendationService;

     @GetMapping("/")
    public Map<String, List<Anime>> home() {
        List<Anime> trendingAnime = recommendationService.getCurrentSeasonAnime(8);
        List<Anime> topRatedAnime = recommendationService.getTopRatedAnime(8);

        return Map.of(
            "trendingAnime", trendingAnime,
            "topRatedAnime", topRatedAnime
        );
    }
}
