package Calculator;

import java.awt.*;
import  java.awt.event.*;//отслеживать реакцию на визуальном поле
import javax.swing.*;//набор графических элементов
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class CalculatorSimpleGUI extends JFrame{
    private final int SIZE_BUTTON=16;
    private JButton []buttons= new JButton[SIZE_BUTTON];
    private String []textBut= {"7","8","9","/","4","5","6","*","1","2","3","-","C","0","=","+"};
    Context calc=new Context();


    private JTextField input=new JTextField("",16);
    private JLabel label=new JLabel("Input");
    private JRadioButton radio1=new JRadioButton("Select this");
    private JRadioButton radio2=new JRadioButton("Select that");
    private JCheckBox check=new JCheckBox("Check",false);

    public CalculatorSimpleGUI(){//конструктор ()
        super("MyCalculator");
        this.setBounds(100,100,350,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=this.getContentPane();
        container.setLayout(new GridLayout(5,4,1,3));

        container.add(label);
        container.add(input);
/*

        container.add(radio2);
        container.add(check);*/
        for (int i=0;i<SIZE_BUTTON;i++) {
            this.buttons[i] = new JButton(textBut[i]);
            buttons[i].addActionListener(new ButtonEventListener(textBut[i]));
            container.add(buttons[i]);
        }
        /*button.addActionListener(new ButtonEventListener());
        container.add(button);*/
        //but7.addActionListener(getTitle());

    }
    private void setTextMyBut(String[]name){


    }


    class ButtonEventListener implements ActionListener{
        char key;
        ButtonEventListener(String text){
           key=text.toCharArray()[0];
        }

        public void actionPerformed(ActionEvent e){
            //char key=buttons[0].getText().toCharArray()[0];

            calc.press(key);
            input.setActionCommand(calc);

        }
    }
}
