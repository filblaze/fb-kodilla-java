package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.6)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.4)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 3)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 3))
        );
    }
}
