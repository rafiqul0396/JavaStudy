package com.company.ENUMS;

public enum Color {
    RED(100),GREEN(200),YELLOW(300),WHITE(30),BLACK(50),
    PINK(60),ORANGE(90);

     final int colorless;
    Color(int colorless){
        this.colorless =colorless;
    }
}
