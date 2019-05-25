package com.zipcodewilmington.scientificcalculator;

public class CalSciFunctions {

    enum UnitMode{
        DEG, RAD, GRAD;
    }

    private Double memoryValue;
    private Double currentValue;

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

     //   if(mode
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

}
