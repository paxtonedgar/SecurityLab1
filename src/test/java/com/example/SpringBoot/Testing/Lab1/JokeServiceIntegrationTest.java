package com.example.SpringBoot.Testing.Lab1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JokeServiceIntegrationTest {
    @Test
    void shouldReturnRandomDadJoke() {
        JokeService jokeService = new JokeService();
        String firstRandomDadJoke = jokeService.getDadJoke();
        assertThat(firstRandomDadJoke).isNotNull();
        String secondRandomDadJoke = jokeService.getDadJoke();
        assertThat(secondRandomDadJoke).isNotNull();
        assertThat(firstRandomDadJoke).isNotEqualTo(secondRandomDadJoke);
    }
}