package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike");
        User yvonne = new YGeneration("Yvonne");
        User zack = new ZGeneration("Zack");

        //When
        String mikeShares = mike.sharePost();
        String yvonneShares = yvonne.sharePost();
        String zackShares = zack.sharePost();

        //Then
        assertEquals("Share on Facebook", mikeShares);
        assertEquals("Share on Snapchat", yvonneShares);
        assertEquals("Share on Twitter", zackShares);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike");

        //When
        mike.setPublisher(new TwitterPublisher());
        String mikeShares = mike.sharePost();

        //Then
        assertEquals("Share on Twitter", mikeShares);
    }
}
