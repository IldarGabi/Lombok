package ru.netology;

public class Radio {
    private long currentRadioStationNumber;
    private long maxRadioStation;
    private long minRadioStation;
    private long maxVolume;
    private long minVolume;
    private long currentVolume;

    public long getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(long currentRadioStationNumber) {
        if (currentRadioStationNumber > maxRadioStation)
            return;
        if (currentRadioStationNumber < minRadioStation)
            return;
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public long getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(long maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public long getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(long minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public long getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(long maxVolume) {
        this.maxVolume = maxVolume;
    }

    public long getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(long minVolume) {
        this.minVolume = minVolume;
    }

    public long getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(long currentVolume) {
        if (currentVolume>maxVolume)
            return;
        if (currentVolume<minVolume)
            return;
        this.currentVolume = currentVolume;
    }

    // change stations
    public void changeOnNextRadioStations() {
           if (currentRadioStationNumber == maxRadioStation)
               currentRadioStationNumber = minRadioStation;
           else currentRadioStationNumber++;
    }

    public void changeOnPrevRadioStations() {
        if (currentRadioStationNumber == minRadioStation)
            currentRadioStationNumber = maxRadioStation;
        else currentRadioStationNumber--;
    }

// change volume
    public void changeVolumeIncrease () {
        if (currentVolume < maxVolume)
            currentVolume++;
        else currentVolume = maxVolume;
    }

    public void changeVolumeDecrease () {
        if (currentVolume > minVolume)
            --currentVolume;
        else currentVolume = minVolume;
    }
}

