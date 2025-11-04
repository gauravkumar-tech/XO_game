package com.gaurav.gaurav.studentClassNObject;

public class Student {
    static String instituteName;
    String studentName;

    static{
        instituteName = "Code With Gaurav";
    }

    Student(String studentName){
        this.studentName = studentName;
    }

    public void calculateResult(String[] subjectName,float[] marksObtainedInParticularSubjects, int totalSubjects){
        float totalObtainedMarks = 0.0f;
        System.out.println(instituteName + " Annual Report Card.");
        System.out.println("Student Name : "+ this.studentName);

        System.out.println("Printing subject wise marks;");
        for(int i= 0; i<subjectName.length;i++){
            float subjectMarks = marksObtainedInParticularSubjects[i];
            System.out.println(subjectName[i]+ " : "+ subjectMarks);
            totalObtainedMarks += subjectMarks;
        }
        System.out.println("Checking and printing your final result. \nYou final result is : "+ passOrFail(totalSubjects,totalObtainedMarks));
    }

    private String passOrFail(int totalSubject, float totalMarksObtained){
         float calculateMinMarks = (totalSubject * 100) * (40/100);
         if(totalMarksObtained >= calculateMinMarks){
             return "Pass";
         }else{
             return "Failed";
         }
    }
}
