package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchVolumeTest extends BaseTestClass {

    @Test
    public void checkUpVolumeWhenNumberStepEqualsOne() {

        int expectedVolume = rad.getVolume() + 1;

        rad.upVolume();

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void checkUpVolumeWhenNumberVolumeEqualsTen() {

        rad.setVolume(10);

        int expectedVolume = rad.getVolume();

        rad.upVolume();

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void checkDownVolumeWhenNumberStepEqualsOne() {

        int expectedVolume = rad.getVolume();

        rad.downVolume();

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);
    }

    @Test
    public void checkDownVolumeWhenNumberVolumeEqualsZero() {

        rad.setVolume(0);

        int expectedVolume = rad.getVolume();

        rad.downVolume();

        int actualVolume = rad.getVolume();

        assertEquals(expectedVolume, actualVolume);
    }
}
