package ru.netology;

public class Radio {
    long currentRadioStationNumber;
    long maxRadioStation;
    long minRadioStation;
    long nextRadioStation;
    long maxVolume;
    long minVolume;
    long currentVolume;
    long changeVolumeIncrease;
    long changeVolumeDecrease;


    // change stations
    public long changeOnNextRadioStations() {
        if (currentRadioStationNumber < maxRadioStation) {
            return ++currentRadioStationNumber;
        }
           if (currentRadioStationNumber == maxRadioStation)
               return nextRadioStation = minRadioStation;
    return nextRadioStation;
    }

    public long changeOnPrevRadioStations() {
        if (currentRadioStationNumber > minRadioStation) {
            return --currentRadioStationNumber;
        }
        if (currentRadioStationNumber == minRadioStation)
            return nextRadioStation = maxRadioStation;
        return nextRadioStation;
    }

// change volume
    public long changeVolumeIncrease () {
        if (currentVolume < maxVolume) {
            return ++currentVolume;
        }
        if (currentVolume == maxVolume){
            return changeVolumeIncrease = maxVolume;
        }
        return changeVolumeIncrease;
    }

    public long changeVolumeDecrease () {
        if (currentVolume > minVolume) {
            return --currentVolume;
        }
        if (currentVolume == minVolume){
            return changeVolumeDecrease = minVolume;
        }
        return changeVolumeDecrease;
    }
}

