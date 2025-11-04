package com.gaurav.anshul;

public class StudentReport {
    String studentName;
    float studentMarks1;
    float studentMarks2;
    float studentMarks3;
    float studentMarks4;
    float studentMarks5;

    public StudentReport(String studentName, float studentMarks1, float studentMarks2, float studentMarks3, float studentMarks4, float studentMarks5) {
        this.studentName = studentName;
        this.studentMarks1 = studentMarks1;
        this.studentMarks2 = studentMarks2;
        this.studentMarks3 = studentMarks3;
        this.studentMarks4 = studentMarks4;
        this.studentMarks5 = studentMarks5;
    }

    float getTotalMarks() {
        return studentMarks1 + studentMarks2 + studentMarks3 + studentMarks4 + studentMarks5 ;
    }

    double getAverage() {
        return  getTotalMarks() / 5.0;
    }

    String getGrade() {
        if (getAverage() >= 80) {
            return " Grade A ";
        } else if (getAverage() >= 60 && getAverage() < 80) {
            return " Grade B ";
        } else if (getAverage() >= 40 && getAverage() < 60) {
            return " Grade C ";
        } else
            return " You didn't Qualified ";
    }

    void displayStudentReportCard() {
        System.out.println(" Student Name : " + studentName);
        System.out.println(" Student Marks : " + studentMarks1 + " , " + studentMarks2 + " , " + studentMarks3 + " , " + studentMarks4 + " , " + studentMarks5);
        System.out.println(" Student Total Marks " + getTotalMarks());
        System.out.println(" Average Marks " + getAverage());
        System.out.println(" Student Grade " + getGrade());
    }

}
