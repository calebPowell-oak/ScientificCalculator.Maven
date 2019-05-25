package com.zipcodewilmington.scientificcalculator;

public class CalSciFunctions {

    enum UnitMode{
        DEG, RAD, GRAD;
    }

    private Double memoryValue;
    private Double currentValue;
    private Double factorialCutoff = 0.000001;

    private UnitMode currentUnitMode;

    private Boolean memoryIsSet;

    public CalSciFunctions() {
        memoryValue  = new Double(0);
        currentValue = new Double(0);
        currentUnitMode = UnitMode.DEG;
        memoryIsSet = false;
    }

    public void setCurrentValue(Double x){
        currentValue = x;
    }



    // memory functions
    public void setMemory(Double x){
        memoryValue = x;
        memoryIsSet = true;
    }

    public void resetMemory(){
        memoryValue = new Double(0);
        memoryIsSet = false;
    }

    public Double recallMemory(){
        return memoryValue;
    }



    // Trig Functions
    public Double sine(Double x){
        x = toCurrentMode(x);
        return new Double(Math.sin(x.doubleValue()));
    }

    public Double cosine(Double x){
        x = toCurrentMode(x);
        return new Double(Math.cos(x.doubleValue()));
    }

    public Double tangent(Double x){
        x = toCurrentMode(x);
        return new Double(0);
    }

    public Double arcsine(Double x){
        x = new Double(Math.asin(x.doubleValue()));
        return toCurrentMode(x);
    }

    public Double arccosine(Double x){
        x = new Double(Math.acos(x.doubleValue()));
        return toCurrentMode(x);
    }

    public Double arctangent(Double x){
        x = new Double(Math.atan(x.doubleValue()));
        return toCurrentMode(x);
    }


    // Switch trig units mode
    public void switchUnitsMode(){
        switch (currentUnitMode){
            case DEG:
                currentUnitMode = UnitMode.RAD;
            case RAD:
                currentUnitMode = UnitMode.GRAD;
            case GRAD:
                currentUnitMode = UnitMode.DEG;
        }
    }

    public void switchUnitsMode(String mode){

        if(mode.equalsIgnoreCase("deg"))
            currentUnitMode = UnitMode.DEG;
        if(mode.equalsIgnoreCase("degree"))
            currentUnitMode = UnitMode.DEG;
        if(mode.equalsIgnoreCase("degrees"))
            currentUnitMode = UnitMode.DEG;
        if(mode.equalsIgnoreCase("rad"))
            currentUnitMode = UnitMode.RAD;
        if(mode.equalsIgnoreCase("radian"))
            currentUnitMode = UnitMode.RAD;
        if(mode.equalsIgnoreCase("radians"))
            currentUnitMode = UnitMode.RAD;
        if(mode.equalsIgnoreCase("grad"))
            currentUnitMode = UnitMode.GRAD;
        if(mode.equalsIgnoreCase("gradian"))
            currentUnitMode = UnitMode.GRAD;
        if(mode.equalsIgnoreCase("gradians"))
            currentUnitMode = UnitMode.GRAD;
    }


    // Logarithmic Functions
    public Double log(Double x){
        return Double.valueOf(Math.log10(x.doubleValue()));
    }

    public Double ln(Double x){
        return Double.valueOf(Math.log(x.doubleValue()));
    }

    public Double tenToTheX(Double x){
        return Double.valueOf(Math.pow(10,x));
    }

    public Double exp(Double x){
        return Double.valueOf(Math.exp(x));
    }



    // Factorial
    public Double factorial(Double x){
        if(Double.compare(x,x - x.intValue()) > factorialCutoff)
            return Double.NaN;
        else if(x.compareTo(Double.valueOf(0)) == -1)
            return Double.NaN;
        else
            return factFunction(x);

    }


    // I just want this in any calculator
    public Double e(){
        return Double.valueOf(Math.exp(1));
    }

    public Double pi(){
        return Double.valueOf(Math.PI);
    }





    // helper methods
    public Double toCurrentMode(Double x){
        switch (currentUnitMode){
            case DEG:
                x = degToRad(x);
                break;
            case GRAD:
                x = gradToRad(x);
                break;
            case RAD:
                break;
        }
        return x;
    }

    public Double degToRad(Double x){
        return (x * Math.PI)/180;
    }

    public Double gradToRad(Double x){
        return (x * Math.PI)/200;
    }


    public Double factFunction(Double x){
        int y;
        int z = 1;
        if(x.compareTo(Double.valueOf(0))==0)
            return Double.valueOf(1);
        else
            y = x.intValue();
            for(int i=1;i<=y;i++){
                z*=i;
            }
            return Double.valueOf(z);
    }

}
