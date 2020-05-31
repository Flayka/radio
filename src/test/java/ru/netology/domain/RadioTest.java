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
        radio.setCurrentStation(2);
        radio.makeNumberStationLower();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeHigher() {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.increaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeLower() {
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.decreaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberStationIsMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.makeNumberStationHigher();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeNumberStationIsMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.makeNumberStationLower();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.makeNumberStationHigher();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeNumberStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-3);
        radio.makeNumberStationLower();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeIsMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeIsMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
