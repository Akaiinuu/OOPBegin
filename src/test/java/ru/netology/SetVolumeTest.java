package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetVolumeTest extends BaseTestClass {

    @Test
    public void checkSetVolumeWhenNumberEqualsTen() {

        int expectedVolume = rad.getVolume();

        rad.setVolume(10);

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void checkVolumeWhenNumberEqualsZero() {

        int expectedVolume = rad.getVolume();

        rad.setVolume(0);

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void checkVolumeWhenNumberEqualsEleven() {

        int expectedVolume = rad.getVolume();

        rad.setVolume(11);

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);

    }

    @Test
    public void checkVolumeWhenNumberEqualsMinusOne() {

        int expectedVolume = rad.getVolume();

        rad.setVolume(-1);

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);
    }
}
