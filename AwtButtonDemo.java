import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    int c = 0 ;
    Label l;
    Button b ;

    public MyFrame(){
        super("Button Demo");

        l = new Label("   " + c);
        b = new Button("Click Me");

        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        c++;
        l.setText("   " + c);
    }
    
}

public class AwtButtonDemo {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
