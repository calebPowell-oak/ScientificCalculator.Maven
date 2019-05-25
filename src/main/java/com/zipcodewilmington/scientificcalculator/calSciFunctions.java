package com.zipcodewilmington.scientificcalculator;

public class calSciFunctions {

    enum UnitMode{
        DEG, RAD, GRAD;
    }

    private Double memoryVal;
    private Double currentVal;
    private UnitMode currentUnitMode;

    public calSciFunctions() {
        memoryVal  = new Double(0);
        currentVal = new Double(0);
        currentUnitMode = UnitMode.DEG;
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




    // user memory management
    public void clearMemory(){
//        clear mem
    }

    public void mPlus(Double disp){
//        add to memVal
    }

    public Double getMemory(){
//        give back current memVal
        return 0d;
    }


    // logarithmic functions
    public Double log(Double a){
        return 0d;
    }

    public Double inverseLog(Double a){
        return 0d;
    }

    public Double naturalLog(Double a){
        return 0d;
    }

    public Double inverseNatLog(Double a){
        return 0d;
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
            default:
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
