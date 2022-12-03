package com.company.DataTypes;

public class DataTypes {
    // Numeric primitives can be cast in two ways. Implicit casting happens when the source type has smaller range than
    //the target type.

    //Implicit casting
    byte byteVar = 42;
    short shortVar = byteVar;
    int intVar = shortVar;
    private long intvar;
    long longVar = intvar;
    float floatVar = longVar;
    double doubleVar = floatVar;
    
    
    //Explicit casting
    double doubleVar1 = 42.0d;
    float floatVar1 = (float) doubleVar;
    long longVar1 = (long) floatVar;
    int intVar1 = (int) longVar;
    short shortVar1 = (short) intVar;
    byte byteVar1 = (byte) shortVar;

    public static void main(String[] args) {
        char char1 = 1, char2 = 2;
        short short1 = 1, short2 = 2;
        int int1 = 1, int2 = 2;
        float float1 = 1.0f, float2 = 2.0f;
        char1 = (char) (char1 + char2);
        int1 = char1 + char2;


        byte b=127;
        b++;
        System.out.println(b);

    }
}
