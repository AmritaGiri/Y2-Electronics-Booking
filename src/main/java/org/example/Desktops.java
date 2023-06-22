package org.example;

import java.util.Objects;

public class Desktops extends Computers  {
private String monitor ;

    public Desktops(String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate, String monitor) {
        super(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.monitor = monitor;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Desktops{" +
                "monitor='" + monitor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Desktops desktops = (Desktops) o;
        return monitor.equals(desktops.monitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), monitor);
    }
}
