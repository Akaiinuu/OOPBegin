package ru.netology;

public class Radio {

    private int numberRadioStation = 4;

    private int volume = 5;

    public void nextRadioStation() {

        numberRadioStation = numberRadioStation + 1;

        if (numberRadioStation > 9) {
            numberRadioStation = 0;
        }
    }


    public void prevRadioStation() {

        numberRadioStation = numberRadioStation - 1;

        if (numberRadioStation < 0) {

            numberRadioStation = 9;
        }
    }

    public void setNumberRadioStation(int numberRadioStation) {
        if (numberRadioStation > 9) {
            return;
        }

        if (numberRadioStation < 0) {
            return;
        }

        this.numberRadioStation = numberRadioStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void upVolume() {

        if (volume < 10) {

            volume = volume + 1;
        }

        if (volume > 10) {

            volume = 10;
        }
    }

    public void downVolume() {

        if (volume > 0) {

            volume = volume - 1;
        }

        if (volume < 0) {

            volume = 0;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            return;
        }

        if (volume < 0) {
            return;
        }

        this.volume = volume;
    }

}
