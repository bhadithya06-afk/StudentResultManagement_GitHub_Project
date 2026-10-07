package com.jain.cse;

public class Main {

    public static void main(String[] args) {

        StudentResult result = new StudentResult("JAIN001", "Rahul");

        result.addMarks("Java", 86);
        result.addMarks("Cloud DevOps", 91);
        result.addMarks("DBMS", 78);
        result.addMarks("Python", 88);

        System.out.println("===== Student Result =====");
        System.out.println("Student ID   : " + result.getStudentId());
        System.out.println("Student Name : " + result.getStudentName());
        System.out.println("Total Marks  : " + result.calculateTotal());
        System.out.printf("Percentage   : %.2f%%%n", result.calculatePercentage());
        System.out.println("Grade        : " + result.calculateGrade());
        System.out.println("Result       : " + (result.isPassed() ? "PASS" : "FAIL"));
    }
}
