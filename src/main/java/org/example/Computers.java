package org.example;

import java.util.Objects;

public class Computers {

    private String manufacturer ;
    private String processor ;
    private String ramSize ;
    private String diskSize ;
    private String weight ;
    private String assetTag ;
    private String purchaseDate ;

    public Computers(String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.weight = weight;
        this.assetTag = assetTag;
        this.purchaseDate = purchaseDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(String diskSize) {
        this.diskSize = diskSize;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAssetTag() {
        return assetTag;
    }

    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", diskSize='" + diskSize + '\'' +
                ", weight='" + weight + '\'' +
                ", assetTag='" + assetTag + '\'' +
                ", purchaseDate='" + purchaseDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computers computers = (Computers) o;
        return manufacturer.equals(computers.manufacturer) &&
                processor.equals(computers.processor) &&
                ramSize.equals(computers.ramSize) &&
                diskSize.equals(computers.diskSize) &&
                weight.equals(computers.weight) &&
                assetTag.equals(computers.assetTag) &&
                purchaseDate.equals(computers.purchaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
    }
}








