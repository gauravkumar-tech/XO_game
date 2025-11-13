package com.practice.anshul;

public class StudentResult {
    public static void main(String[] args) {
        StudentReport studentReport = new StudentReport("Akash", 78.86f, 65.00f,76.90f, 56.89f, 89.00f);
        studentReport.getTotalMarks();
        studentReport.getAverage();
        studentReport.getGrade();
        studentReport.displayStudentReportCard();
    }
}
