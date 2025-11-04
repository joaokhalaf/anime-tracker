package com.github.joaokhalaf.anime_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class AnimeTrackerApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure()
                .directory(".")
                .ignoreIfMissing()
                .ignoreIfMalformed()
                .load();

        dotenv.entries().forEach(e ->
            System.setProperty(e.getKey(), System.getProperty(e.getKey(), e.getValue()))
        );

        SpringApplication.run(AnimeTrackerApplication.class, args);
    }
}
