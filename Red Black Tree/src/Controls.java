import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Controls extends JPanel implements ActionListener {
  RBT s; 
  public void actionPerformed(ActionEvent e) {
    String op = (String) b.getSelectedItem();
    Scanner read = new Scanner(a.getText());
    ArrayList<Integer> values = new ArrayList<Integer>();
    while (read.hasNext()) {
      values.add(read.nextInt());
    }
    System.out.println( op + " " + values );
    this.s.send(op, values); 
    a.setText("");
  }
  JComboBox b;
  JTextField a; 
  public Controls(RBT s) {
    this.s = s;
    String[] bOptions = { "Insert", "Remove", "Find" };
    b = new JComboBox(bOptions);
    this.add(b); 
    this.add(new JLabel("the following value(s): "));
    a = new JTextField(10); 
    this.add(a); 
    JButton c = new JButton("Apply"); 
    c.addActionListener(this); 
    this.add(c);    
    
  }
}