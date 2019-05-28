package com.zipcodewilmington.scientific_calculator;

import com.sun.xml.internal.ws.policy.AssertionSet;
import com.zipcodewilmington.scientificcalculator.BasicFunctions;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicFunctionsTest {

    @Test
    public void addition1() {
        // Arrange
        Double x = 1d, y = 1d;


        // Act
        Double result = BasicFunctions.addition(x,y);

        // Assert
        Assert.assertEquals(2d, result, 0.000000001);
    }

    @Test
    public void addition2(){
        // Arrange
        Double x = 1324.5, y = 0.543;


        // Act
        Double result = BasicFunctions.addition(x,y);

        // Assert
        Assert.assertEquals(1325.043,result,0.00000001);
    }

    @Test
    public void addition3(){
        // Arrange
        Double x = 3457.865486, y = -8765.1345;


        // Act
        Double result = BasicFunctions.addition(x,y);

        // Assert
        Assert.assertEquals(-5307.269014,result,0.00000001);
    }

    @Test
    public void subtraction1() {
        // Arrange
        Double x = 345.0, y = 7654.0;


        // Act
        Double result = BasicFunctions.subtraction(x,y);

        // Assert
        Assert.assertEquals(-7309,result,0.00000000001);
    }

    @Test
    public void subtraction2(){
        // Arrange
        Double x = 3456.756, y = -45.3;


        // Act
        Double result = BasicFunctions.subtraction(x,y);

        // Assert
        Assert.assertEquals(3502.056,result,0.00000001);
    }

    @Test
    public void subtraction3(){
        // Arrange
        Double x = 64.5, y = 0.0;


        // Act
        Double result = BasicFunctions.subtraction(x,y);

        // Assert
        Assert.assertEquals(64.5, result, 0.0000000001);
    }

    @Test
    public void subtraction4(){
        // Arrange
        Double x = 0.0, y = 345.234;


        // Act
        Double result = BasicFunctions.subtraction(x,y);

        // Assert
        Assert.assertEquals(-345.234, result, 0.000000001);
    }

    @Test
    public void multiplication1() {
        // Arrange
        Double x = 0.0, y = 4567.345;


        // Act
        Double result = BasicFunctions.multiplication(x,y);

        // Assert
        Assert.assertEquals(0.0, result, 0.00000001);
    }

    @Test
    public void multiplication2(){
        // Arrange
        Double x = 435.6, y = 74.0;


        // Act
        Double result = BasicFunctions.multiplication(x,y);

        // Assert
        Assert.assertEquals(32234.4, result, 0.0000000001);
    }

    @Test
    public void multiplication3(){
        // Arrange
        Double x = -45.67, y = 643.6;


        // Act
        Double result = BasicFunctions.multiplication(x,y);

        // Assert
        Assert.assertEquals(-29393.212, result, 0.000000001);
    }

    @Test
    public void multiplication4(){
        // Arrange
        Double x = 45.67, y = -643.6;


        // Act
        Double result = BasicFunctions.multiplication(x,y);

        // Assert
        Assert.assertEquals(-29393.212, result, 0.000000001);
    }

    @Test
    public void multiplication5(){
        // Arrange
        Double x = -745.3, y = -7.7;


        // Act
        Double result = BasicFunctions.multiplication(x,y);

        // Assert
        Assert.assertEquals(5738.81, result, 0.000000001);
    }

    @Test
    public void division1(){
        Double x = 3.4, y = 2345.0;


        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(0.00144989339, result, 0.00000000001);
    }

    @Test
    public void division2(){
        Double x = 45.0, y = 9.0;


        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(5.0, result, 0.000000001);
    }

    @Test
    public void division3(){
        Double x = -456.432, y = 345.5;


        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(-1.32107670043, result, 0.00000000001);
    }

    @Test
    public void division4(){
        Double x = 53.7, y = -4567.6784;


        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(-0.01175651946, result, 0.0000000001);
    }

    @Test
    public void division5(){
        Double x = 0.0, y= 434.34;


        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(0.0, result, 0.0000000001);
    }

    @Test
    public void division6(){
        Double x = 0.0, y = -32.0;


        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(0.0, result, 0.0000000001);
    }

    @Test
    public void division7(){
        Double x = 23.0, y = 0.0;

        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(Double.POSITIVE_INFINITY, result, 0.000000000);
    }

    @Test
    public void division8(){
        Double x = -23.0, y = 0.0;

        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(Double.NEGATIVE_INFINITY, result, 0.000000001);
    }

    @Test
    public void division9(){
        Double x = 0.0, y = 0.0;

        Double result = BasicFunctions.division(x,y);

        Assert.assertEquals(Double.NaN, result, 0.0000000001);
    }

    @Test
    public void root1() {
        // Arrange
        Double x = 81.0;


        // Act
        Double result =  BasicFunctions.root(x);

        // Assert
        Assert.assertEquals(9.0,result,0.0000001);
    }

    @Test
    public void root2(){
        // Arrange
        Double x = 345.0;


        // Act
        Double result = BasicFunctions.root(x);

        // Assert
        Assert.assertEquals(18.574175621006, result, 0.0000001);
    }

    @Test
    public void root3(){
        // Arrange
        Double x = -1.0;


        // Act
        Double result  = BasicFunctions.root(x);

        // Assert
        Assert.assertEquals(1.0, result, 0.0000001);
    }

    @Test
    public void power1(){
        Double x = 1.0, y = 345456.0;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(1.0, result, 0.0000001);
    }

    @Test
    public void power2(){
        Double x = 0.0, y = 345.0;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(0.0, result, 0.00000001);
    }

    @Test
    public void power3(){
        Double x = 12.0, y = 4.0;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(20736.0, result, 0.00000001);
    }

    @Test
    public void power4(){
        Double x = 2.3, y = 3.0;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(12.167, result, 0.00000001);
    }

    @Test
    public void power5(){
        Double x = 3.0, y = 2.3;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(12.5135025328, result, 0.0000000001);
    }

    @Test
    public void power6(){
        Double x = -4.0, y = 3.0;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(-64.0, result, 0.0000000001);
    }

    @Test
    public void power7(){
        Double x = 5.2, y = -3.4;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(0.00367780443, result, 0.00000000001);
    }

    @Test
    public void power8(){
        Double x = -7.3, y = -6.4;

        Double result = BasicFunctions.power(x,y);

        Assert.assertEquals(Double.NaN, result, 0.0000001);
    }

    @Test
    public void square1(){
        Double x = 1.0;

        Double result = BasicFunctions.square(x);

        Assert.assertEquals(1.0, result, 0.00000001);
    }

    @Test
    public void square2(){
        Double x = 12.0;

        Double result = BasicFunctions.square(x);

        Assert.assertEquals(144.0, result, 0.0000000001);
    }

    @Test
    public void square3(){
        Double x = 3.5;

        Double result = BasicFunctions.square(x);

        Assert.assertEquals(12.25, result, 0.0000000001);
    }

    @Test
    public void square4(){
        Double x = -4.0;

        Double result = BasicFunctions.square(x);

        Assert.assertEquals(16.0, result, 0.000000001);
    }

    @Test
    public void invert1(){
        Double x = 1.0;

        Double result = BasicFunctions.invert(x);

        Assert.assertEquals(1.0, result, 0.000000001);
    }

    @Test
    public void invert2(){
        Double x = 6.5;

        Double result = BasicFunctions.invert(x);

        Assert.assertEquals(0.15384615384, result, 0.0000000001);
    }

    @Test
    public void invert3(){
        Double x = -7.0;

        Double result = BasicFunctions.invert(x);

        Assert.assertEquals(-0.14285714285, result, 0.0000000001);
    }

    @Test
    public void invert4(){
        Double x = 0.0;

        Double result = BasicFunctions.invert(x);

        Assert.assertEquals(Double.POSITIVE_INFINITY, result, 0.000000001);
    }

    @Test
    public void flipSign1(){
        Double x = 1.4;

        Double result = BasicFunctions.flipSign(x);

        Assert.assertEquals(-1.4, result, 0.000000001);
    }

    @Test
    public void flipSign2(){
        Double x = -0.54;

        Double result = BasicFunctions.flipSign(x);

        Assert.assertEquals(0.54, result, 0.000000001);
    }

    @Test
    public void flipSign3(){
        Double x = 0.0;

        Double result = BasicFunctions.flipSign(x);

        Assert.assertEquals(0.0, result, 0.000000001);
    }

    @Test
    public void flipSign4(){
        Double x = -0.0;

        Double result = BasicFunctions.flipSign(x);

        Assert.assertEquals(0.0, result, 0.000000001);
    }
}