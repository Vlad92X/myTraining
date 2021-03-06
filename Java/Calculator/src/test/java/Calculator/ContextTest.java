package Calculator;

import static org.junit.Assert.*;

public class ContextTest {

    @org.junit.Test
    public void run() throws Exception{
        Context context= new Context();

        assertEquals(0,context.run("C"));
        assertEquals(0,context.run("C="));
        assertEquals(2,context.run("C2"));
        assertEquals(25,context.run("C25"));
        assertEquals(257452,context.run("C257452"));
        assertEquals(257452,context.run("C257452="));
        assertEquals(5,context.run("C2+3="));
        assertEquals(777,context.run("C123+654="));
        assertEquals(8,context.run("C2+2*2="));
        assertEquals(10,context.run("C5+="));
        assertEquals(100,context.run("C125-25="));
        assertEquals(20,context.run("C100/5="));
        assertEquals(56,context.run("C7*8="));
        assertEquals(2025,context.run("C45*45="));
        assertEquals(5625,context.run("C75*75="));
        assertEquals(57,context.run("C45-7*3/2="));
        assertEquals(1,context.run("C9/5="));
        assertEquals(0,context.run("C231527*000="));
        assertEquals(0,context.run("C=231527*000="));
        assertEquals(50,context.run("C45*-/*-*/+*+5="));
        assertEquals(1,context.run("C9/9="));
        assertEquals(5,context.run("C5/1="));
        assertEquals(45,context.run("C5+15=30="));

    }
}