package org.example;

import java.util.Objects;

public class Laptops extends Computers {
private String screenSize ;
private int batteryHours ;

    public Laptops(String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate, String screenSize, int batteryHours) {
        super(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.screenSize = screenSize;
        this.batteryHours = batteryHours;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryHours() {
        return batteryHours;
    }

    public void setBatteryHours(int batteryHours) {
        this.batteryHours = batteryHours;
    }

    @Override
    public String toString() {
        return "Laptops{" +
                super.toString()+
                "screenSize='" + screenSize + '\'' +
                ", batteryHours=" + batteryHours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptops laptops = (Laptops) o;
        return batteryHours == laptops.batteryHours &&
                screenSize.equals(laptops.screenSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenSize, batteryHours);
    }
}
