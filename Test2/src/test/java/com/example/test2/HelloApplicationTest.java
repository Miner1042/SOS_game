package com.example.test2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void addition() {
        assertEquals(6, HelloApplication.addition(5));
    }

    @Test
    void subtract() {
        assertEquals(4, HelloApplication.subtract(5));
    }
}