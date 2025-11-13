package com.practice.gaurav.inheritance;

class Employee{
    static String benefits;

    Employee(){
        this.addBenefits();
    }

    void addBenefits(){
        benefits = "Employee Benefits added";
    }

    static void printBenefits(){
        System.out.println(benefits);
    }
}

class Manager extends Employee{

    Manager(){
        this.addBenefits();
    }

    @Override
    void addBenefits() {
        benefits= "Manager benefits added";
    }
}

class Director extends Manager{

    Director(){
        this.addBenefits();
    }

    @Override
    void addBenefits() {
        benefits="Director benefits added";
    }
}

public class InhertianceEx {

    public static void main(String[]args){
        Employee director = new Director();
        Employee.printBenefits();

        Employee manager = new Manager();
        Employee.printBenefits();

        Employee employee = new Employee();
        Employee.printBenefits();
    }

}
