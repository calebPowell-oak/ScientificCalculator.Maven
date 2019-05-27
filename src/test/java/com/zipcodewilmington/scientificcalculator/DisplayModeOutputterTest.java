package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayModeOutputterTest {

    @Test
    public void getOutputB1() {
        // Arrange
        Double a = Double.valueOf(1.5);

        // Act
        String result = DisplayModeOutputter.getOutput(a,0);

        // Assertion

        Assert.assertEquals("1.1",result);
    }

    @Test
    public void getOutputB2() {
        // Arrange
        Double a = Double.valueOf(1.55);

        // Act
        String result = DisplayModeOutputter.getOutput(a,0);

        // Assertion

        Assert.assertEquals("1.10001100110011001100",result);
    }

    public void getOutputB3(){
        // Arrange
        Double a = 12.55;

        // Act;
        String result = DisplayModeOutputter.getOutput(a,0);

        // Assertion
        Assert.assertEquals(1100.10001100110011001100,result);
    }

    @Test
    public void getOutputO1() {
        // Arrange
        Double a = Double.valueOf(1.625);

        // Act
        String result = DisplayModeOutputter.getOutput(a,1);

        // Assertion

        Assert.assertEquals("1.5",result);
    }

    @Test
    public void getOutputO2() {
        // Arrange
        Double a = Double.valueOf(1.55);

        // Act
        String result = DisplayModeOutputter.getOutput(a,1);

        // Assertion
        Assert.assertEquals("1.431463",result);
    }

    @Test
    public void getOutputO3(){
        // Arrange
        Double a = 12.55;

        // Act
        String result = DisplayModeOutputter.getOutput(a,1);

        // Assertion
        Assert.assertEquals("14.431463",result);
    }

    @Test
    public void getOutputD1(){
        // Arrange
        Double a = Double.valueOf(1.55);

        // Act
        String result = DisplayModeOutputter.getOutput(a, 2);

        // Assertion
        Assert.assertEquals("1.55",result);
    }

    @Test
    public void getOutputD2(){
        // Arrange
        Double a = Double.valueOf(1.625);

        // Act
        String result = DisplayModeOutputter.getOutput(a, 2);

        // Assertion
        Assert.assertEquals("1.625", result);
    }

    @Test
    public void getOutputH1(){
        // Arrange
        Double a = Double.valueOf(1.55);

        // Act
        String result = DisplayModeOutputter.getOutput(a,3);

        // Assertion
        Assert.assertEquals("1.8cccc",result);
    }

    @Test
    public void getOutputH2(){
        // Arrange
        Double a = Double.valueOf(1.82);

        // Act
        String result = DisplayModeOutputter.getOutput(a,3);

        // Assertion
        Assert.assertEquals("1.d1eb8",result);
    }

    @Test
    public void getOutputH3(){
        // Arrange
        Double a = 164.82;

        // Act
        String result = DisplayModeOutputter.getOutput(a,3);

        // Assertion
        Assert.assertEquals("a4.d1eb8",result);
    }

    @Test
    public void getOutputDefault1(){
        // Arrange
        Double a = 1.645;

        // Act
        String result = DisplayModeOutputter.getOutput(a);

        // Assertion
        Assert.assertEquals("1.645",result);
    }

    @Test
    public void getOutputDefault2(){
        // Arrange
        Double a = 234.654;

        // Act
        String result = DisplayModeOutputter.getOutput(a);

        // Assertion
        Assert.assertEquals("234.654",result);
    }

    @Test
    public void getOutputNaNB1(){
        // Arrange
        Double d = Double.NaN;

        // Act
        String result = DisplayModeOutputter.getOutput(d,0);

        // Assert
        Assert.assertEquals("NaN",result);
    }

    @Test
    public void getOutputNaNO1(){
        // Arrange
        Double d = Double.NaN;

        // Act
        String result = DisplayModeOutputter.getOutput(d,1);

        // Assert
        Assert.assertEquals("NaN",result);
    }

    @Test
    public void getOutputNaND1(){
        // Arrange
        Double d = Double.NaN;

        // Act
        String result = DisplayModeOutputter.getOutput(d,2);

        // Assert
        Assert.assertEquals("NaN",result);
    }

    @Test
    public void getOutputNaNH1(){
        // Arrange
        Double d = Double.NaN;

        // Act
        String result = DisplayModeOutputter.getOutput(d,3);

        // Assert
        Assert.assertEquals("NaN",result);
    }

    @Test
    public void getOutputInfB1(){
        // Arrange
        Double d = 1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,0);

        // Assert
        Assert.assertEquals("NaN",result);

    }

    @Test
    public void getOutputInfO1(){
        // Arrange
        Double d = 1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,1);

        // Assert
        Assert.assertEquals("NaN",result);

    }

    @Test
    public void getOutputInfD1(){
        // Arrange
        Double d = 1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,2);

        // Assert
        Assert.assertEquals("NaN",result);

    }

    @Test
    public void getOutputInfH1(){
        // Arrange
        Double d = 1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,3);

        // Assert
        Assert.assertEquals("NaN",result);

    }

    @Test
    public void getOutputInfB2(){
        // Arrange
        Double d = -1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,0);

        // Assert
        Assert.assertEquals("NaN",result);

    }

    @Test
    public void getOutputInfO2(){
        // Arrange
        Double d = -1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,1);

        // Assert
        Assert.assertEquals("NaN",result);

    }

    @Test
    public void getOutputInfD2(){
        // Arrange
        Double d = -1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,2);

        // Assert
        Assert.assertEquals("NaN",result);

    }

    @Test
    public void getOutputInfH2(){
        // Arrange
        Double d = -1.0/0.0;

        // Act
        String result = DisplayModeOutputter.getOutput(d,3);

        // Assert
        Assert.assertEquals("NaN",result);

    }
}