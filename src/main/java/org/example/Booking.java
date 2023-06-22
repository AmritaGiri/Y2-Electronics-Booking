package org.example;

import java.util.Objects;

public class Booking {
private String bookingId ;
private String bookingDateTime ;
private String returnDateTime ;
private String computerType ;
private String ComputerAssetTag ;
private String studentId ;

    public Booking(String bookingId, String bookingDateTime, String returnDateTime, String computerType, String computerAssetTag, String studentId) {
        this.bookingId = bookingId;
        this.bookingDateTime = bookingDateTime;
        this.returnDateTime = returnDateTime;
        this.computerType = computerType;
        ComputerAssetTag = computerAssetTag;
        this.studentId = studentId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(String bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public String getComputerAssetTag() {
        return ComputerAssetTag;
    }

    public void setComputerAssetTag(String computerAssetTag) {
        ComputerAssetTag = computerAssetTag;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "ComputerBooking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDateTime='" + bookingDateTime + '\'' +
                ", returnDateTime='" + returnDateTime + '\'' +
                ", computerType='" + computerType + '\'' +
                ", ComputerAssetTag='" + ComputerAssetTag + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking that = (Booking) o;
        return bookingId.equals(that.bookingId) &&
                bookingDateTime.equals(that.bookingDateTime) &&
                returnDateTime.equals(that.returnDateTime) &&
                computerType.equals(that.computerType) &&
                ComputerAssetTag.equals(that.ComputerAssetTag) &&
                studentId.equals(that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, bookingDateTime, returnDateTime, computerType, ComputerAssetTag, studentId);
    }
}
