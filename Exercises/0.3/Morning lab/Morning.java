//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Morning extends JFrame
{
  private EasySound rooster;

  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    rooster.play();

    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
