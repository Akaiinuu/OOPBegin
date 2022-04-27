package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchRadioStationTest extends BaseTestClass {


    @Test
    public void checkNextRadioWhenNumberStepEqualsOne() {

        int expectedRadioStation = rad.getNumberRadioStation() + 1;

        rad.nextRadioStation();

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);

    }

    @Test
    public void checkNextRadioWhenCurrentNumberRadioEqualsNine() {

        rad.setNumberRadioStation(9);

        int expectedRadioStation = 0;

        rad.nextRadioStation();

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);

    }

    @Test
    public void checkPrevRadioWhenNumberStepEqualsOne() {

        int expectedRadioStation = rad.getNumberRadioStation() - 1;

        rad.prevRadioStation();

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);

    }

    @Test
    public void checkPrevRadioWhenNumberRadioEqualsZero() {

        rad.setNumberRadioStation(0);

        int expectedRadioStation = 9;

        rad.prevRadioStation();

        int actualRadioStation = rad.getNumberRadioStation();

        assertEquals(expectedRadioStation, actualRadioStation);
    }
}
