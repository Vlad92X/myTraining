package Winderton.app.sandbox;

import Winderton.app.events.Dispatcher;
import Winderton.app.events.Event;
import Winderton.app.events.types.MouseMotionEvent;
import Winderton.app.events.types.MousePressedEvent;
import Winderton.app.events.types.MouseReleasedEvent;
import Winderton.app.layers.Layer;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

import java.util.Random;


public class Example extends Layer {

    private String name;
    private Color color;
    private Rectangle rect;
    private boolean dragging=false;
    private int pX,pY;

    private static final Random random= new Random();

    public Example(String name,Color color){
        this.name=name;
        this.color=color;
        rect=new Rectangle(random.nextInt(100)+150,
                             random.nextInt(100)+250,
                                120,240);
    }

    @Override
    public void onEvent(Event event){
        Dispatcher dispatcher=new Dispatcher(event);

       dispatcher.dispatch(Event.Type.MOUSE_PRESSED,
                        (Event e) -> onPressed((MousePressedEvent)e));
        // *** старая альтернатива или что по сути делает лямбда выше ***
        //  /*     dispatcher.dispatch(Event.Type.MOUSE_PRESSED,
        //                   new EventHandler() {
        //             @Override
        //             public boolean handle(Event e) {
        //                return onPressed((MousePressedEvent)e);
        //            }
        //         }); */
        dispatcher.dispatch(Event.Type.MOUSE_RELEASED,
                        (Event e) -> onReleased((MouseReleasedEvent) e));
        dispatcher.dispatch(Event.Type.MOUSE_MOVED,
                        (Event e) -> onMoved((MouseMotionEvent) e));

    }

    @Override
    public void onRender(Graphics g){

        g.setColor(color);
        g.fillRect(rect.x,rect.y,rect.width,rect.height);

        g.setColor(Color.WHITE);
        g.drawString(name,rect.x+15,rect.y+35);
    }

    private boolean onPressed(MousePressedEvent event){
        System.out.println("pressed");
        if (rect.contains(new Point(event.getX(),event.getY())))
            dragging=true;
        return false;
    }

    private boolean onReleased(MouseReleasedEvent event){
        System.out.println("Released");
        dragging=false;
        return dragging;
    }

    private boolean onMoved(MouseMotionEvent event){
        //System.out.println("Mouse moved"+ event.getX()+"|"+event.getY());
        if(dragging){
            rect.x+= event.getX()-pX;
            rect.y+=event.getY()-pY;
        }
        pX=event.getX();
        pY=event.getY();
        return false;
    }
}
