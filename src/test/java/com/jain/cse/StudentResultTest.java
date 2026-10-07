package com.jain.cse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentResultTest {

    @Test
    void shouldCalculateTotalMarks() {
        StudentResult result = new StudentResult("JAIN001", "Rahul");

        result.addMarks("Java", 80);
        result.addMarks("DBMS", 75);
        result.addMarks("Python", 85);

        assertEquals(240, result.calculateTotal());
    }

    @Test
    void shouldCalculatePercentage() {
        StudentResult result = new StudentResult("JAIN002", "Ananya");

        result.addMarks("Java", 80);
        result.addMarks("DBMS", 90);
        result.addMarks("Python", 70);

        assertEquals(80, result.calculatePercentage());
    }

    @Test
    void shouldCalculateGrade() {
        StudentResult result = new StudentResult("JAIN003", "Vikram");

        result.addMarks("Java", 92);
        result.addMarks("DBMS", 88);
        result.addMarks("Python", 95);

        assertEquals("A+", result.calculateGrade());
    }

    @Test
    void shouldReturnPassWhenAllSubjectsAreAbovePassMark() {
        StudentResult result = new StudentResult("JAIN004", "Priya");

        result.addMarks("Java", 65);
        result.addMarks("DBMS", 58);
        result.addMarks("Python", 72);

        assertTrue(result.isPassed());
    }

    @Test
    void shouldReturnFailWhenOneSubjectIsBelowPassMark() {
        StudentResult result = new StudentResult("JAIN005", "Arun");

        result.addMarks("Java", 65);
        result.addMarks("DBMS", 35);
        result.addMarks("Python", 72);

        assertFalse(result.isPassed());
    }

    @Test
    void shouldRejectMarksOutsideValidRange() {
        StudentResult result = new StudentResult("JAIN006", "Meera");

        assertThrows(
                IllegalArgumentException.class,
                () -> result.addMarks("Java", 105)
        );
    }
}
