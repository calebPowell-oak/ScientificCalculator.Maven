package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalSciFunctions;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Test;
import org.junit.Assert;
import sun.applet.Main;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    //Trig Functions
    @Test
    public void radSine() {
        // Arrange
        Double x = 120d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x, 1);

        // Assertion
        Assert.assertEquals(new Double(0.58061), result);

    }

    @Test
    public void negRadSine() {
        // Arrange
        Double x = 37d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x, 1);

        // Assertion
        Assert.assertEquals(new Double(-0.64354), result);

    }

    @Test
    public void degreesSine() {
        // Arrange
        Double x = 250d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x, 0);

        // Assertion
        Assert.assertEquals(new Double(-0.93969), result);

    }

    @Test
    public void radCosine() {
        // Arrange
        Double a = 46d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.cosine(a, 1);

        // Assertion
        Assert.assertEquals(new Double(0.90179), result);

    }

    @Test
    public void negRadCosine() {
        // Arrange
        Double a = 98d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.cosine(a, 1);

        // Assertion
        Assert.assertEquals(new Double(-0.13917), result);

    }


    @Test
    public void degreesCosine() {
        // Arrange
        Double a = 175d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.cosine(a, 0);

        // Assertion
        Assert.assertEquals(new Double(-0.99619), result);

    }

    @Test
    public void radTangent() {
        // Arrange
        Double x = 120d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.tangent(x, 1);

        // Assertion
        Assert.assertEquals(new Double(0.71312), result);

    }

    @Test
    public void negRadTangent() {
        // Arrange
        Double x = 37d;
        CalSciFunctions c = new CalSciFunctions();
        // Act
        Double result = c.tangent(x, 1);

        // Assertion
        Assert.assertEquals(new Double(-3.88011), result);

    }

    @Test
    public void degreesTangent() {
        // Arrange
        Double x = 42d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.tangent(x, 0);

        // Assertion
        Assert.assertEquals(new Double(0.90040), result);

    }

    @Test
    public void radArccosine() {
        // Arrange
        Double a = .5;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arccosine(a, 1);

        // Assertion
        Assert.assertEquals(new Double(1.04720), result);

    }

    @Test
    public void negRadArccosine() {
        // Arrange
        Double a = 0d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arccosine(a, 1);

        // Assertion
        Assert.assertEquals(new Double(1), result);

    }


    @Test
    public void degreesArccosine() {
        // Arrange
        Double a = 32d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arccosine(a, 0);

        // Assertion
        Assert.assertEquals(new Double(0.97821), result);


    }

    @Test
    public void arctangentZero() {
        // Arrange
        Double x = 1d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arctangent(x, 0);

        // Assertion
        Assert.assertEquals(new Double(1.57080), result);

    }

    @Test
    public void arctangent() {
        // Arrange
        Double x = 0d;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arctangent(x, 0);

        // Assertion
        Assert.assertEquals(new Double(-0.64354), result);

    }

    @Test
    public void arctangentPos() {
        // Arrange
        Double x = 2.5;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x, 0);

        // Assertion
        Assert.assertEquals(new Double(1.57080), result);

    }
}




