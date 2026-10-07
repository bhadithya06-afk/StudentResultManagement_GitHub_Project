package com.jain.cse;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentResult {

    private final String studentId;
    private final String studentName;
    private final Map<String, Double> subjectMarks = new LinkedHashMap<>();

    public StudentResult(String studentId, String studentName) {
        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("Student ID cannot be empty.");
        }

        if (studentName == null || studentName.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be empty.");
        }

        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Adds or updates marks for a subject.
    public void addMarks(String subject, double mark) {
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Subject name cannot be empty.");
        }

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }

        subjectMarks.put(subject, mark);
    }

    // Returns the total marks obtained in all registered subjects.
    public double calculateTotal() {
        double total = 0;

        for (double mark : subjectMarks.values()) {
            total += mark;
        }

        return total;
    }

    // Returns the average percentage of all registered subjects.
    public double calculatePercentage() {
        if (subjectMarks.isEmpty()) {
            return 0;
        }

        return calculateTotal() / subjectMarks.size();
    }

    // Returns a grade based on the calculated percentage.
    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "F";
        }
    }

    // A student passes only when every registered subject has at least 40 marks.
    public boolean isPassed() {
        if (subjectMarks.isEmpty()) {
            return false;
        }

        for (double mark : subjectMarks.values()) {
            if (mark < 40) {
                return false;
            }
        }

        return true;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}
