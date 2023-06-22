package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB {

    private ArrayList<Student> studentList;

    public StudentDB() {
        this.studentList = new ArrayList<>();
    }

    public Student FindStudentByID(String id) {
        for (Student s : studentList) {
            if (s.getId().equals(id))
                return s;
        }
        return null;
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void displayStudentByID(String id) {
        for (Student s : studentList) {
            if (s.getId().equals(id)) {
                System.out.println(s);
            }
        }
    }

    public void removeStudentByID(String id) {
        Student student = FindStudentByID(id);
        if (student != null)
            studentList.remove(student);
    }

    public void loadStudentFromFile() {
        // open 'student.txt file
        // read records and instantiate new student objects
        // add each new student object to s

        System.out.println("Reading studentDB from file....");
        try {
            Scanner sc = new Scanner(new File("studentsData.txt"));
            try {
                while (sc.hasNext()) {
                    String name = sc.next();
                    String id = sc.next();
                    String email = sc.next();
                    String phone = sc.next();
                    String ComputerOnLoan = sc.next();

                    System.out.println("NAME: " + name + "ID: " + id + "EMAIL: " + email + "PHONE: " + phone
                            + "COMPUTER ON LOAN: " + ComputerOnLoan);
                    studentList.add(new Student(name, id, email, phone, ComputerOnLoan));
                }
                System.out.println("All students loaded");
                sc.close();
            } finally {
                sc.close();
            }
            System.out.println("All Students: " + studentList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // catch (IOException e) {
        // System.out.println("IOException thrown in
        // loadStudentFromFile()"+e.getMessage());
        // }
        //
    }

    public void saveStudentToFile() {
        try (BufferedWriter studentFile = new BufferedWriter(new FileWriter("studentsData.txt"))) {
            for (Student student : studentList) {
                studentFile.write(student.getName() + "," + student.getId() + "," + student.getEmail() + ","
                        + student.getPhone() + "," + student.getComputerOnLoan());
                studentFile.write("\n");
            }
        } catch (IOException ioe) {
            System.out.println("Could not save students.");
        }
    }
}
