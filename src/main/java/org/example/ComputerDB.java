package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerDB {
    private ArrayList<Computers> computersList;

    public ComputerDB() {
        computersList = new ArrayList<>();
    }

    public void addComputer(Computers c) {
        computersList.add(c);
    }

    public void displayAllComputers() {
        for (Computers c : computersList)
            System.out.println(c);
    }

    public void loadComputerDesktopFromFile() {
        // open 'desktopData.txt file
        // read records and instantiate new computer objects
        // add each new computer object to c

        System.out.println("Reading ComputerDesktopDB from file....");
        try {
            Scanner sc = new Scanner(new File("desktopData.txt"));
            while (sc.hasNext()) {
                String manufacturer = sc.next();
                String processor = sc.next();
                String ramSize = sc.next();
                String diskSize = sc.next();
                String assetTag = sc.next();
                String purchaseDate = sc.next();
                String monitor = sc.next();

                System.out.println("MANUFACTURER: " + manufacturer + "PROCESSOR: " + processor + "RAM SIZE: " + ramSize
                        + "DISK SIZE: " + diskSize + "ASSEST TAG: " + assetTag + "PURCHASE DATE: " + purchaseDate
                        + "MONITOR: " + monitor);
                computersList.add(
                        new Computers(manufacturer, processor, ramSize, diskSize, assetTag, purchaseDate, monitor));
            }
            System.out.println("All Desktop loaded");
            sc.close();
            System.out.println("All Desktop: " + computersList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // catch (IOException e) {
        // System.out.println("IOException thrown in
        // loadStudentFromFile()"+e.getMessage());
        // }
        //
    }

    public void saveComputerDesktopToFile() {
        try (BufferedWriter ComputerFile = new BufferedWriter(new FileWriter("desktopData.txt"))) {
            for (Computers computers : computersList) {
                ComputerFile.write(computers.getManufacturer() + "," + computers.getProcessor() + ","
                        + computers.getRamSize() + "," + computers.getDiskSize() + "," + computers.getAssetTag() + ","
                        + computers.getPurchaseDate());
                ComputerFile.write("\n");
            }
        } catch (IOException ioe) {
            System.out.println("Could not save computer.");
        }
    }

}
