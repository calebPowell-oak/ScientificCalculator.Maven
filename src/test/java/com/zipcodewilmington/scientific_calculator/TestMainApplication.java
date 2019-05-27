package com.zipcodewilmington.scientific_calculator;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
//Trig Functions
    @Test
    public void radSine() {
        // Arrange
        Double x = 120;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x);

        // Assertion
        Assert.assertEquals(new Double(0.58061), result);

    }
    @Test
    public void negRadSine() {
        // Arrange
        Double x = 37;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x);

        // Assertion
        Assert.assertEquals(new Double(-0.64354), result);

    }

    @Test
    public void degreesSine() {
        // Arrange
        Double x = 250;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x);

        // Assertion
        Assert.assertEquals(new Double(-0.93969), result);

    }
    @Test
    public void radCosine() {
        // Arrange
        Double a = 46;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.cosine(a);

        // Assertion
        Assert.assertEquals(new Double(0.90179), result);

    }
}
    @Test
    public void negRadCosine() {
        // Arrange
        Double a = 98;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.cosine(a);

        // Assertion
        Assert.assertEquals(new Double(-0.13917), result);

    }


    @Test
    public void degreesCosine() {
        // Arrange
        Double a = 175;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.cosine(a);

        // Assertion
        Assert.assertEquals(new Double(-0.99619), result);

        }

    @Test
    public void radTangent() {
        // Arrange
        Double x = 120;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.tangent(x);

        // Assertion
        Assert.assertEquals(new Double(0.71312), result);

    }
    @Test
    public void negRadTangent() {
        // Arrange
        Double x = 37;
        CalSciFunctions c = new CalSciFunctions();
        // Act
        switchUnitsMode s = new switchUnitsMode();
        Unimode.RAD;
        Double result = c.tangent(x);

        // Assertion
        Assert.assertEquals(new Double(-3.88011), result);

    }

    @Test
    public void degreesTangent() {
        // Arrange
        Double x = 42;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.tangent(x);

        // Assertion
        Assert.assertEquals(new Double(0.90040), result);

    }
    @Test
    public void radArccosine() {
        // Arrange
        Double a = .5;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arccosine(a);

        // Assertion
        Assert.assertEquals(new Double(1.04720), result);

    }
}
    @Test
    public void negRadArccosine() {
        // Arrange
        Double a = 0;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arccosine(a);

        // Assertion
        Assert.assertEquals(new Double(1), result);

        }


    @Test
    public void degreesArccosine() {
        // Arrange
        Double a = 32;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arccosine(a);

        // Assertion
        Assert.assertEquals(new Double(0.97821), result);


        }

    @Test
    public void arctangent() {
        // Arrange
        Double x = 1;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arctangent(x);

        // Assertion
        Assert.assertEquals(new Double(1.57080), result);

        }
    @Test
    public void arctangent() {
        // Arrange
        Double x = 0;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.arctangent(x);

        // Assertion
        Assert.assertEquals(new Double(-0.64354), result);

        }

    @Test
    public void arctangent() {
        // Arrange
        Double x = 2.5;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.sine(x);

        // Assertion
        Assert.assertEquals(new Double(1.57080), result);

        }
//Mode conversions - RAD, DEG, and GRAD
    @Test
    public void degTotoCurrentMode() {
        // Arrange
        Double degrees = 75;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = degrees.degToRad(x);

        // Assertion
        Assert.assertEquals(new Double(1.309), result);

        }

    @Test
    public void deg2TotoCurrentMode() {
        // Arrange
        Double a = 98;
        CalSciFunctions c = new CalSciFunctions();
        // Act


        Double result = a.degToRad(x);
        // Assertion
        Assert.assertEquals(new Double(1.71042), result);

        }


    @Test
    public void gradToRadtoCurrentMode() {
        // Arrange
        Double a = 175;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.gradToRad();

        // Assertion
        Assert.assertEquals(new Double(2.74889), result);

        }

    @Test
    public void gradToRad2toCurrentMode() {
        // Arrange
        Double x = 120;
        CalSciFunctions c = new CalSciFunctions();
        // Act

        Double result = c.gradToRad();

        // Assertion
        Assert.assertEquals(new Double(1.88496), result);

        }




