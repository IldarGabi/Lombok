package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RadioTest {

//    change stations
    @Test
    void changeOnNextRadioStations() {
        Radio stations = new Radio();
        stations.setMaxRadioStation(9);
        stations.setCurrentRadioStationNumber(7);
        stations.setMinRadioStation(0);
        stations.changeOnNextRadioStations();
        long expected = 8;
        assertEquals(expected, stations.getCurrentRadioStationNumber());
        System.out.println(expected);
    }

    @Test
    void changeOnPrevRadioStations() {
        Radio stations = new Radio();
        stations.setMaxRadioStation(9);
        stations.setCurrentRadioStationNumber(7);
        stations.setMinRadioStation(0);
        stations.changeOnPrevRadioStations();
        long expected = 6;
        assertEquals(expected, stations.getCurrentRadioStationNumber());
        System.out.println(expected);
    }

    //    change volume
    @Test
    void changeVolumeIncrease() {
        Radio stations = new Radio();
        stations.setMaxVolume(10);
        stations.setCurrentVolume(5);
        stations.setMinVolume(0);
        stations.changeVolumeIncrease();
        long expected = 6;
        assertEquals(expected,stations.getCurrentVolume());
        System.out.println(expected);
    }

    @Test
    void changeVolumeDecrease() {
        Radio stations = new Radio();
        stations.setMaxVolume(10);
        stations.setCurrentVolume(9);;
        stations.setMinVolume(0);
        stations.changeVolumeDecrease();
        long expected = 8;
        assertEquals(expected,stations.getCurrentVolume());
        System.out.println(expected);
    }
}


