
import javax.swing.*; 
import java.awt.*; 

public class RBTApplication extends JFrame {
  static int WIDTH = 600;
  static int HEIGHT = 400;
  
  public static void main(String[] args) {
    RBTApplication f = new RBTApplication();
    Container c = f.getContentPane(); 
    RBT b = new RBT();
    c.setLayout(new BorderLayout()); 
    c.add(new Controls(b), BorderLayout.NORTH);
    c.add(b, BorderLayout.CENTER);
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // for QoL
    f.setVisible(true);
    c.setBackground(Color.WHITE);
    f.setSize(WIDTH, HEIGHT); 
  }
}