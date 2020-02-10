package Winderton.app.events.types;

import Winderton.app.events.Event;

public class MouseButtonEvent extends Event {


    private int keyCode, x, y;

    public MouseButtonEvent(Type type, int keyCode, int x, int y){
        super(type);
        this.x= x;
        this.y=y;
        this.keyCode=keyCode;
    }


    public int getKeyCode() {
        return keyCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
