import Calculator.Context;
import Calculator.CalculatorSimpleGUI;

import javax.swing.*;
import java.io.IOException;

public class Program extends JFrame {

    public static void main(String[] args) {

        CalculatorSimpleGUI app=new CalculatorSimpleGUI();
        app.setVisible(true);
      //  new Program();


    }



private Program() throws IOException {
        startMyFirstUI();
}

private void startMyFirstUI()throws IOException {
    System.out.println("Welcome to integer Calculator!");
    Context calc=new Context();
    while (true) {

        char key = (char) System.in.read();
        if(key>=' ') {
            calc.press(key);
            System.out.println(calc);
        }
    }

}


}
