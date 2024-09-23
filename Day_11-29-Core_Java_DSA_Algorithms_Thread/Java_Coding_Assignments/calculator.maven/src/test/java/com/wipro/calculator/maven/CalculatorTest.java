package com.wipro.calculator.maven;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    static Calculator cal;

    @BeforeAll
    public static void beforeAll() {
        cal = new Calculator();
        System.out.println("Before All only once");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All only once");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each test case");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each test case");
    }

    @Test
    @DisplayName("Test ADD")
    @Tag("t1")
    void testAdd() {
        int actual = cal.add(5, 5);
        assertEquals(10, actual);
        System.out.println("add tested");
    }

    @Test
    @DisplayName("Test SUB")
    @Tag("t1")
    void testSub() {
        int actual = cal.sub(15, 5);
        assertEquals(10, actual);
        System.out.println("sub tested");
    }

    @Test
    @DisplayName("Test MUL")
    @Tag("t1")
    void testMul() {
        int actual = cal.mul(5, 2);
        assertEquals(10, actual);
        System.out.println("mul tested");
    }

    @Test
    @DisplayName("Test DIV")
    void testDiv() {
        int actual = cal.div(10, 2);
        assertEquals(5, actual);
        System.out.println("div tested");
    }

    @Test
    @DisplayName("Test DIV by Zero")
    void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> {
            cal.div(10, 0);
        });
        System.out.println("div by zero tested");
    }
}