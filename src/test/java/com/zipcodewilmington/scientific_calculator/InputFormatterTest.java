package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.InputFormatter;
import jdk.internal.util.xml.impl.Input;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputFormatterTest {

    @Test
    public void stringToDouble() {
        // Arrange
        String s = "1000";

        // Act
        Double result = InputFormatter.stringToDouble(s,2);

        // Assertion
        Assert.assertEquals(1000.0,result,0.0000001);
    }

    @Test
    public void stringToDouble2() {
        // Arrange
        String s = "1000.";

        // Act
        Double result = InputFormatter.stringToDouble(s,2);

        // Assertion
        Assert.assertEquals(1000.0,result,0.0000001);
    }

    @Test
    public void stringToDouble3(){
        // Arrange
        String s = ".1";

        //Act
        Double result = InputFormatter.stringToDouble(s,2);

        // Assertion
        Assert.assertEquals(0.1,result,0.0000001);
    }

    @Test
    public void formatB1(){
        // Arrange
        String s = "1001.1";

        // Act
        Double result = InputFormatter.format(s,0);

        // Assertion
        Assert.assertEquals(9.5,result,0.0000001);
    }

    @Test
    public void formatB2(){
        // Arrange
        String s = ".1011010";

        // Act
        Double result = InputFormatter.format(s,0);

        // Assertion
        Assert.assertEquals(0.703125,result,0.0000001);
    }

    @Test
    public void formatB3(){
        // Arrange
        String s = "0110.";

        // Act
        Double result = InputFormatter.format(s,0);

        // Assertion
        Assert.assertEquals(6.0,result,0.0000001);
    }

    @Test
    public void formatB4(){
        // Arrange
        String s = "10011.01101";

        // Act
        Double result = InputFormatter.format(s,0);

        // Assertion
        Assert.assertEquals(19.40625,result,0.0000001);
    }

    @Test
    public void format01(){
        // Arrange
        String s = "1642.543";

        // Act
        Double result = InputFormatter.format(s,1);

        // Assertion
        Assert.assertEquals(930.693359375,result,0.0000001);
    }

    @Test
    public void formatO2(){
        // Arrange
        String s = "0.3465";

        // Act
        Double result = InputFormatter.format(s,1);

        // Assertion
        Assert.assertEquals(0.450439453125,result,0.0000001);
    }

    @Test
    public void formatO3(){
        // Arrange
        String s = "642.737";

        // Act
        Double result = InputFormatter.format(s,1);

        // Assertion
        Assert.assertEquals(418.935546875,result,0.00000001);
    }

    @Test
    public void formatO4(){
        // Arrange
        String s = "345.0146";

        // Act
        Double result = InputFormatter.format(s,1);

        // Assertion
        Assert.assertEquals(229.02490234375, result,0.0000001);
    }

    @Test
    public void formatH1(){
        // Arrange
        String s = "abc.def";

        // Act
        Double result = InputFormatter.format(s,3);

        // Assertion
        Assert.assertEquals(2748.870849609375,result,0.0000001);
    }

    @Test
    public void formatH2(){
        // Arrange
        String s = "b00.ca7";

        // Act
        Double result = InputFormatter.format(s,3);

        // Arrange
        Assert.assertEquals(2816.790771484375, result, 0.0000001);
    }

    @Test
    public void formatH3(){
        // Arrange
        String s = "13e7.5c111";

        // Act
        Double result = InputFormatter.format(s,3);

        // Assertion
        Assert.assertEquals(5095.359635353088, result, 0.0000001);
    }

    @Test
    public void formatH4(){
        // Arrange
        String s = "ca.9";

        // Act
        Double result = InputFormatter.format(s, 3);

        // Assertion
        Assert.assertEquals(202.5625, result, 0.0000001);
    }

    @Test
    public void formatD1(){
        // Arrange
        String s = "1374.38";

        // Act
        Double result = InputFormatter.format(s,2);

        // Assertion
        Assert.assertEquals(1374.38, result, 0.00000001);
    }

    @Test
    public void formatD2(){
        // Arrange
        String s = ".3546";

        // Act
        Double result = InputFormatter.format(s,2);

        // Assertion
        Assert.assertEquals(.3546, result, 0.00000001);
    }


    @Test
    public void getLeftValueD1() {
        // Arrange
        String s = "1000";

        // Act
        Double result = InputFormatter.getLeftValue(s,2);

        // Assertion
        Assert.assertEquals(Double.valueOf(1000.0),result);
    }

    @Test
    public void getLeftValueB1() {
        // Arrange
        String s = "1111101000";

        // Act
        Double result = InputFormatter.getLeftValue(s,0);

        // Assertion
        Assert.assertEquals(Double.valueOf(1000.0),result);
    }

    @Test
    public void getLeftValueO1() {
        // Arrange
        String s = "1750";

        // Act
        Double result = InputFormatter.getLeftValue(s,1);

        // Assertion
        Assert.assertEquals(Double.valueOf(1000.0),result);
    }

    @Test
    public void getLeftValueH1() {
        // Arrange
        String s = "3e8";

        // Act
        Double result = InputFormatter.getLeftValue(s,3);

        // Assertion
        Assert.assertEquals(Double.valueOf(1000.0),result);
    }


    @Test
    public void getLeftValueD2() {
        // Arrange
        String s = "642";

        // Act
        Double result = InputFormatter.getLeftValue(s,2);

        // Assertion
        Assert.assertEquals(Double.valueOf(642.0),result);
    }

    @Test
    public void getLeftValueB2() {
        // Arrange
        String s = "1010000010";

        // Act
        Double result = InputFormatter.getLeftValue(s,0);

        // Assertion
        Assert.assertEquals(Double.valueOf(642.0),result);
    }

    @Test
    public void getLeftValueO2() {
        // Arrange
        String s = "1202";

        // Act
        Double result = InputFormatter.getLeftValue(s,1);

        // Assertion
        Assert.assertEquals(Double.valueOf(642.0),result);
    }

    @Test
    public void getLeftValueH2() {
        // Arrange
        String s = "282";

        // Act
        Double result = InputFormatter.getLeftValue(s,3);

        // Assertion
        Assert.assertEquals(Double.valueOf(642.0),result);
    }

    @Test
    public void getLeftValueD3() {
        // Arrange
        String s = "8947";

        // Act
        Double result = InputFormatter.getLeftValue(s,2);

        // Assertion
        Assert.assertEquals(Double.valueOf(8947.0),result);
    }

    @Test
    public void getLeftValueB3() {
        // Arrange
        String s = "10001011110011";

        // Act
        Double result = InputFormatter.getLeftValue(s,0);

        // Assertion
        Assert.assertEquals(Double.valueOf(8947.0),result);
    }

    @Test
    public void getLeftValueO3() {
        // Arrange
        String s = "21363";

        // Act
        Double result = InputFormatter.getLeftValue(s,1);

        // Assertion
        Assert.assertEquals(Double.valueOf(8947.0),result);
    }

    @Test
    public void getLeftValueH3() {
        // Arrange
        String s = "22f3";

        // Act
        Double result = InputFormatter.getLeftValue(s,3);

        // Assertion
        Assert.assertEquals(Double.valueOf(8947.0),result);
    }







    @Test
    public void getRightValueD1() {
        // Arrange
        String s = "5";

        // Act
        Double result = InputFormatter.getRightValue(s, 2);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.5),result, 0.0000001);
    }

    @Test
    public void getRightValueB1() {
        // Arrange
        String s = "1";

        // Act
        Double result = InputFormatter.getRightValue(s, 0);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.5),result, 0.0000001);
    }

    @Test
    public void getRightValueO1() {
        // Arrange
        String s = "4";

        // Act
        Double result = InputFormatter.getRightValue(s, 1);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.5),result, 0.0000001);
    }

    @Test
    public void getRightValueH1() {
        // Arrange
        String s = "8";

        // Act
        Double result = InputFormatter.getRightValue(s, 3);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.5),result, 0.0000001);
    }


    @Test
    public void getRightValueD2() {
        // Arrange
        String s = "542";

        // Act
        Double result = InputFormatter.getRightValue(s, 2);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.542),result, 0.0000001);
    }

    @Test
    public void getRightValueB2() {
        // Arrange
        String s = "1001";

        // Act
        Double result = InputFormatter.getRightValue(s, 0);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.5625),result, 0.0000001);
    }

    @Test
    public void getRightValueO2() {
        // Arrange
        String s = "44";

        // Act
        Double result = InputFormatter.getRightValue(s, 1);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.5625),result, 0.0000001);
    }

    @Test
    public void getRightValueH2() {
        // Arrange
        String s = "9";

        // Act
        Double result = InputFormatter.getRightValue(s, 3);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.5625),result, 0.0000001);
    }

    @Test
    public void getRightValueD3() {
        // Arrange
        String s = "98456";

        // Act
        Double result = InputFormatter.getRightValue(s, 2);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.98456),result, 0.0000001);
    }

    @Test
    public void getRightValueB3() {
        // Arrange
        String s = "11110011001";

        // Act
        Double result = InputFormatter.getRightValue(s, 0);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.94970703125),result, 0.0000001);
    }

    @Test
    public void getRightValueO3() {
        // Arrange
        String s = "7462";

        // Act
        Double result = InputFormatter.getRightValue(s, 1);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.94970703125),result, 0.0000001);
    }

    @Test
    public void getRightValueH3() {
        // Arrange
        String s = "f32";

        // Act
        Double result = InputFormatter.getRightValue(s, 3);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.94970703125),result, 0.0000001);
    }

    @Test
    public void getRightValueD4() {
        // Arrange
        String s = "6630859375";

        // Act
        Double result = InputFormatter.getRightValue(s, 2);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.6630859375),result, 0.0000001);
    }

    @Test
    public void getRightValueB4() {
        // Arrange
        String s = "1010100111";

        // Act
        Double result = InputFormatter.getRightValue(s, 0);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.6630859375),result, 0.0000001);
    }

    @Test
    public void getRightValueO4() {
        // Arrange
        String s = "5234";

        // Act
        Double result = InputFormatter.getRightValue(s, 1);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.6630859375),result, 0.0000001);
    }

    @Test
    public void getRightValueH4() {
        // Arrange
        String s = "a9c";

        // Act
        Double result = InputFormatter.getRightValue(s, 3);

        // Assertion
        Assert.assertEquals(Double.valueOf(0.6630859375),result, 0.0000001);
    }

    @Test
    public void formatNH1(){
        // Arrange
        String s = "-fa7";

        // Act
        Double result = InputFormatter.format(s,3);

        // Assertion
        Assert.assertEquals(-4007.0,result,0.0000001);
    }

    @Test
    public void formatNH2(){
        // Arrange
        String s = "+b7.";

        // Act
        Double result = InputFormatter.format(s,3);

        // Assert
        Assert.assertEquals(183.0,result,0.0000001);
    }

    @Test
    public void formatNH3(){
        // Arrange
        String s = "-.543";

        // Act
        Double result = InputFormatter.format(s,3);

        // Assert
        Assert.assertEquals(-0.328857421875,result,0.0000001);
    }

    @Test
    public void formatNH4(){
        // Arrange
        String s = "+a4.c5";

        // Act
        Double result = InputFormatter.format(s,3);

        // Assert
        Assert.assertEquals(164.76953125,result,0.0000001);
    }

    @Test
    public void formatNB1(){
        // Arrange
        String s = "-.001";

        // Act
        Double result = InputFormatter.format(s,0);

        // Assert
        Assert.assertEquals(-0.125,result,0.0000001);
    }

    @Test
    public void formatNB2(){
        // Arrange
        String s = "+1001.";

        // Act
        Double result = InputFormatter.format(s,0);

        // Assert
        Assert.assertEquals(9.0,result,0.0000001);
    }

    @Test
    public void formatNB3(){
        // Arrange
        String s = "110010.";

        // Act
        Double result = InputFormatter.format(s,0);

        // Assert
        Assert.assertEquals(50.0,result,0.0000001);
    }
}