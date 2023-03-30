package com.m2p;

public class Length {

    public static class Unit{
        static final Unit centimeter = new Unit(0.01);
        static final Unit metre = new Unit(1);
        static final Unit kilometer = new Unit(1000);
        private final double baseFactor;

        private Unit(double baseFactor){
            this.baseFactor = baseFactor;
        }
    }

    private final double magnitude;
    private final Unit unit;

    public static Length metre(double magnitude){
        return new Length(magnitude, Unit.metre);
    }
    public static Length centimeter(double magnitude){
        return new Length(magnitude, Unit.centimeter);
    }
    public static Length kilometer(double magnitude){
        return new Length(magnitude, Unit.kilometer);
    }
    public Length(double magnitude, Unit unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object.getClass() != getClass()){
            return false;
        }
        Length that = (Length)object;
        return convertToStandardUnit() == that.convertToStandardUnit();
//        return false;
    }

    private double convertToStandardUnit(){
        return magnitude * unit.baseFactor;
    }
}
