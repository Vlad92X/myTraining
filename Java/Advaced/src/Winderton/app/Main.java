package Winderton.app;

import Winderton.app.core.Window;
import Winderton.app.sandbox.Example;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Window window=new Window("Window",960,640);
        window.addLayer( new Example("Layer-1", Color.BLUE));
        window.addLayer( new Example("Layer-2", Color.RED));
    }

}

