package com.gaurav.gaurav.studentClassNObject;

public class PrintReportCard {
    public static void main(String[]args){
        Student st = new Student("Gaurav");
        st.calculateResult(new String[]{"English","Maths","Science"},new float []{80f, 80f, 80f},3);
    }
}
