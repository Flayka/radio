package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldMakeNumberStationHigher() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.makeNumberStationHigher();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeNumberStationLower() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.makeNumberStationLower();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeHigher() {
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.increaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeLower() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.decreaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

}
