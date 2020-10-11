package ru.netology;

import org.junit.jupiter.api.Test;

class RadioTest {
//    change stations
    @Test
    void changeOnNextRadioStations() {
        Radio stations = new Radio();
        stations.currentRadioStationNumber = 1;
        stations.maxRadioStation = 9;
        stations.minRadioStation = 0;
        stations.nextRadioStation = stations.changeOnNextRadioStations();
        System.out.println(stations.nextRadioStation);
    }

    @Test
    void changeOnPrevRadioStations() {
        Radio stations = new Radio();
        stations.currentRadioStationNumber = 0;
        stations.maxRadioStation = 9;
        stations.minRadioStation = 0;
        stations.nextRadioStation = stations.changeOnPrevRadioStations();
        System.out.println(stations.nextRadioStation);
    }

    //    change volume
    @Test
    void changeVolumeIncrease() {
        Radio stations = new Radio();
        stations.currentVolume = 10;
        stations.maxVolume = 10;
        stations.changeVolumeIncrease = stations.changeVolumeIncrease();
        System.out.println(stations.changeVolumeIncrease);
    }

    @Test
    void changeVolumeDecrease() {
        Radio stations = new Radio();
        stations.currentVolume = 10;
        stations.minVolume = 0;
        stations.changeVolumeDecrease = stations.changeVolumeDecrease();
        System.out.println(stations.changeVolumeDecrease);
    }
}


