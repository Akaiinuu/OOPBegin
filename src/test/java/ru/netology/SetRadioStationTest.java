package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetRadioStationTest extends BaseTestClass {


    @Test
    public void checkSetRadioStationWhenNumberEqualsTen() {

        int expectedRadioStation = rad.getNumberRadioStation();

        rad.setNumberRadioStation(10);

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);

    }

    @Test
    public void checkSetRadioStationWhenNumberEqualsMinusOne() {

        int expectedRadioStation = rad.getNumberRadioStation();

        rad.setNumberRadioStation(-1);

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);

    }

    @Test
    public void checkSetRadioStationWhenNumberEqualsZero() {

        int expectedRadioStation = 0;

        rad.setNumberRadioStation(0);

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);

    }

    @Test
    public void checkSetRadioStationWhenNumberEqualsNine() {

        int expectedRadioStation = 9;

        rad.setNumberRadioStation(9);

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);

    }



}
