package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;
    private boolean on;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxNumberStation) {
            this.currentStation = minNumberStation;
            return;
        }
        if (currentStation < minNumberStation) {
            this.currentStation = maxNumberStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

//    public boolean isOn() {
//        return on;
//    }
//
//    public void setOn(boolean on) {
//        this.on = on;
//    }

    public void makeNumberStationHigher() {
        if (currentStation == maxNumberStation) {
            this.currentStation = minNumberStation;
            return;
        }
        currentStation++;
    }

    public void makeNumberStationLower() {
        if (currentStation == minNumberStation) {
            this.currentStation = maxNumberStation;
            return;
        }
        currentStation--;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}
