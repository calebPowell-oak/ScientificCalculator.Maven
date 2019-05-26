package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalSciFunctionsTest {

    @Test
    public void sineD1() {
        // Arrange
        Double a = Double.valueOf(0);

        // Act
        Double result = CalSciFunctions.sine(a,0);

        // Assertion
        Assert.assertEquals(Double.valueOf(0),result);

    }

    @Test
    public void sineD2() {
        // Arrange
        Double a = Double.valueOf(90);

        // Act
        Double result = CalSciFunctions.sine(a,0);

        // Assertion
        Assert.assertEquals(Double.valueOf(1),result);

    }

    @Test
    public void sineR1() {
        // Arrange
        Double a = Double.valueOf(0);

        // Act
        Double result = CalSciFunctions.sine(a,1);

        // Assertion
        Assert.assertEquals(Double.valueOf(0),result);

    }

    @Test
    public void sineR2() {
        // Arrange
        Double a = Double.valueOf(Math.PI/2);

        // Act
        Double result = CalSciFunctions.sine(a,1);

        // Assertion
        Assert.assertEquals(Double.valueOf(1),result);

    }

    @Test
    public void sineG1() {
        // Arrange
        Double a = Double.valueOf(0);

        // Act
        Double result = CalSciFunctions.sine(a,2);

        // Assertion
        Assert.assertEquals(Double.valueOf(0),result);

    }

    @Test
    public void sineG2() {
        // Arrange
        Double a = Double.valueOf(100);

        // Act
        Double result = CalSciFunctions.sine(a,2);

        // Assertion
        Assert.assertEquals(Double.valueOf(1),result);

    }

    @Test
    public void degToRad1(){
        // Arrange
        Double a = Double.valueOf(90);

        // Act
        Double result = CalSciFunctions.degToRad(a);

        // Assertion
        Assert.assertEquals(Double.valueOf(Math.PI/2),result);
    }

    @Test
    public void gradToRad1(){
        // Arrange
        Double a = Double.valueOf(100);

        // Act
        Double result = CalSciFunctions.gradToRad(a);

        // Assertion
        Assert.assertEquals(Double.valueOf(Math.PI/2),result);
    }

}