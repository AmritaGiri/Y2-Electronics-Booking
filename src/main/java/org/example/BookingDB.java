package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class BookingDB  {

    private ArrayList<Booking> bookingList;


    public BookingDB() {
        bookingList = new ArrayList<>();
    }


    public Booking FindBookingID(String bookingId){
        for (Booking b : bookingList){
            if(b.getBookingId().equals(bookingId))
                return b;
        }
        return null;
    }

    public void numberOfComputersBooked(){
        int count1 = 0;
        int count2 = 0 ;
        int count3 = 0 ;
        for (int i = 0; i < bookingList.size(); i++) {
            if(bookingList.get(i).getComputerType().equals("Desktop"))
            {count1++;}
            else if(bookingList.get(i).getComputerType().equals("Laptop"))
            { count2++;}
            else if(bookingList.get(i).getComputerType().equals("RasberryPi"))
            {count3++;}
        }
        System.out.println("NO OF DESKTOPS BOOKED : " + count1);
        System.out.println("NO OF LAPTOPS BOOKED : " + count2);
        System.out.println("NO OF RASBERRY PI BOOKED : " + count3);

    }


    public void AddBooking(Booking b){
        bookingList.add(b);
    }


    public void removeBookingByID( String bookingId ){
        Booking booking = FindBookingID(bookingId);
            if (booking != null)
                bookingList.remove(booking);
        }



    public void displayAllBooking() {
        for (Booking b : bookingList)
                System.out.println(b);

    }


    public void displayBookingofStudent(String studentid) {
        LocalDateTime myObj = LocalDateTime.now();
        for (int i = 0; i < bookingList.size(); i++) {
            if(bookingList.get(i).getStudentId().equals(studentid))
                System.out.println( studentid + " " + myObj);
        }
    }

    public int displayAverageLengthofBooking(){
        int total = 0 ;
        for(int i =0 ; i<bookingList.size();i++)
        {
            total++;
        }
        int avg = total /5 ;
        return avg;
    }


    public void loadBookingFromFile(){
        //open 'ComputerData.txt file
        //read records and instantiate new booking objects
        // add each new booking object to cb

        System.out.println("Reading BookingDB from file....");
        try{
            Scanner sc = new Scanner(new File("bookingData.txt"));
            while(sc.hasNext()){
                String bookingId = sc.next();
                String bookingDateTime = sc.next();
                String returnDateTime = sc.next();
                String computerType = sc.next();
                String ComputerAssetTag = sc.next();
                String studentId = sc.next();

                System.out.println("NAME: "+bookingId+"ID: "+bookingDateTime+"EMAIL: "+returnDateTime+"PHONE: "+computerType+"COMPUTER ON LOAN: "+ComputerAssetTag+"COMPUTER ON LOAN: "+studentId);
                bookingList.add(new Booking(bookingId,bookingDateTime,returnDateTime,computerType,ComputerAssetTag,studentId));
            }
            System.out.println("All Booking loaded");
            sc.close();
            System.out.println("All Booking: "+ bookingList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        catch (IOException e) {
//            System.out.println("IOException thrown in loadStudentFromFile()"+e.getMessage());
//        }
//
    }


    public void saveBookingToFile()
    {
        try(BufferedWriter bookingFile = new BufferedWriter(new FileWriter("bookingData.txt") ))
        {
            for(Booking booking : bookingList)
            {
                bookingFile.write(booking.getBookingId() +","+booking.getBookingDateTime()+","+booking.getReturnDateTime()+","+booking.getComputerType()+","+booking.getComputerAssetTag()+","+booking.getStudentId());
                bookingFile.write("\n");
            }
        }
        catch(IOException ioe)
        {
            System.out.println("Could not save booking.");
        }
    }
}
