package com.company;

import java.awt.*;

public class Config {
    public static final int SIZE=10;
    public static final int WIDTH=90;
    public static final int HEIGHT=60;
    public static final int SLEEPMS=100;

    public static Color getColor(Status status){
        switch (status) {
            default:
            case NONE:return Color.BLACK;
            case BORN:return Color.PINK;
            case LIVE:return Color.YELLOW;
            case DIED:return Color.RED;
            case ELDER:return Color.ORANGE;
            case OLDER:return Color.WHITE;

        }
    }

}
