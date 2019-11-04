package com.exampletest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Day7Test {
    @Test
    public void firstTest() {
        assertEquals("aaaccc", "aaa".concat("ccc"));
        assertNotEquals("aaaccc", "aaa".concat("ccc").concat("eee"));
    }
    @Test
    public void secondTest() {
        assertEquals("aaaccc", "aaa" + "ccc");
        assertNotEquals("aaaccc", "aaa" + "ccc" + "eee");
    }
    @Test
    public void thirdTest() {
        String value = "Super";
        String formatted = String.format("Welcome %s!", value);
        assertEquals("Welcome Super!", formatted);
        assertNotEquals("Welcome %s!", formatted + "Yey");
    }
    @Test
    public void fourthTest() {
        String value = "Super";
        String formatted = value.substring(2);
        assertEquals("per", formatted);
        assertNotEquals(value, formatted + "Yey");
    }
    @Test
    public void fifthTest() {
        String value = "Super";
        boolean formatted = value.startsWith("S");
        assertEquals(true, formatted);
        assertNotEquals(true, formatted + "Yey");
    }
    @Test
    public void sixthTest() {
        String value = "Super";
        boolean formatted = value.endsWith("r");
        assertEquals(true, formatted);
        assertNotEquals(true, formatted + "Yey");
    }
    @Test
    public void seventhTest() {
        String value = "Super";
        boolean formatted = value.contains("Su");
        assertEquals(true, formatted);
        assertNotEquals(true, formatted + "Yey");
    }
    @Test
    public void eighthTest() {
        String value = "Super";
        boolean formatted = value.isEmpty();
        assertEquals(false, formatted);
        assertNotEquals(false, formatted + "Yey");
    }
    @Test
    public void ninthTest() {
        String value = "Super";
        int formatted = value.length();
        assertEquals(5, formatted);
        assertNotEquals(5, formatted + "Yey");
    }
    @Test
    public void tenthTest() {
        String value = "super";
        String formatted = value.toUpperCase();
        assertEquals("SUPER", formatted);
        assertNotEquals("SUPER", formatted + "Yey");
    }
    @Test
    public void eleventhTest() {
        String value = "SUPER";
        String formatted = value.toLowerCase();
        assertEquals("super", formatted);
        assertNotEquals("super", formatted + "Yey");
    }
    @Test
    public void twelfthTest() {
        String value = "SUPER";
        boolean formatted = value.equals("Super");
        assertEquals(false, formatted);
        assertNotEquals(false, formatted + "Yey");
    }
    @Test
    public void thirteenthTest() {
        String value = "SUpER";
        boolean formatted = value.equalsIgnoreCase("Super");
        assertEquals(true, formatted);
        assertNotEquals(true, formatted + "Yey");
    }
    @Test
    public void fourteenthTest() {
        String value = "Super";
        String formatted = String.format("Welcome %s %s%s!", value, "M", "an");
        assertEquals("Welcome Super Man!", formatted);
        assertNotEquals("Welcome Super Man!", formatted + "Yey");
    }
    @Test
    public void fifteenthTest() {
        String value = "Super";
        String formatted = value.substring(1,5);
        assertEquals("uper", formatted);
        assertNotEquals(value, formatted + "Yey");
    }
}
