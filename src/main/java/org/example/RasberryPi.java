package org.example;

import java.util.Objects;

public class RasberryPi extends Computers {
    private int GIOPin ;
    private String SdStorage ;

    public RasberryPi(String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate, int GIOPin, String sdStorage) {
        super(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.GIOPin = GIOPin;
        SdStorage = sdStorage;
    }

    public int getGIOPin() {
        return GIOPin;
    }

    public void setGIOPin(int GIOPin) {
        this.GIOPin = GIOPin;
    }

    public String getSdStorage() {
        return SdStorage;
    }

    public void setSdStorage(String sdStorage) {
        SdStorage = sdStorage;
    }

    @Override
    public String toString() {
        return "RasberryPi{" +
                "GIOPin=" + GIOPin +
                ", SdStorage='" + SdStorage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RasberryPi that = (RasberryPi) o;
        return GIOPin == that.GIOPin &&
                SdStorage.equals(that.SdStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), GIOPin, SdStorage);
    }
}
