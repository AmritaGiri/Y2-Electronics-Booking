package org.example;

import java.util.Objects;

public class Student {
    private String name ;
    private String id;
    private String email;
    private String phone ;
    private String ComputerOnLoan ;

    public Student(String name, String id, String email, String phone, String computerOnLoan) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
        ComputerOnLoan = computerOnLoan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComputerOnLoan() {
        return ComputerOnLoan;
    }

    public void setComputerOnLoan(String computerOnLoan) {
        ComputerOnLoan = computerOnLoan;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", ComputerOnLoan='" + ComputerOnLoan + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                id.equals(student.id) &&
                email.equals(student.email) &&
                phone.equals(student.phone) &&
                ComputerOnLoan.equals(student.ComputerOnLoan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, email, phone, ComputerOnLoan);
    }
}