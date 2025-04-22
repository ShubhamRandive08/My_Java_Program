import java.awt.*;
import java.awt.event.*;

public class EventDelegationExample extends Frame implements ActionListener{
    Button button;

    public EventDelegationExample(){
        button = new Button("Click Me");

        button.setBounds(50,100,80,30);
        button.addActionListener(this);
        add(button);
        setSize(200,200);
        setSize(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent){
        System.out.println("Button Clicked!");
    }

    public static void main(String a[]){
        new EventDelegationExample();
    }
}
