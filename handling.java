import java.awt.*;
import java.awt.event.*;
public class MouseListenerEvent extends Frame implements MouseListener
{
  Label l;
  MouseListenerEvent()
  {
    addMouseListener(this);
    l=new Label();
    l.setBounds(20,50,100,20);
    add(l);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent we)
      {
      System.exit(0);
      }
    });
  }
  public void mouseClicked(MouseEvent e) 
  {
     System.out.println(&quot;Mouse Clicked&quot;);
  }
  public void mouseEntered(MouseEvent e) 
  {
     System.out.println(&quot;Mouse Entered&quot;);
  }
  public void mouseExited(MouseEvent e)
  {
     System.out.println(&quot;Mouse Exited&quot;);
  }
  public void mousePressed(MouseEvent e)
  {
     System.out.println(&quot;Mouse Pressed&quot;);
  }
  public void mouseReleased(MouseEvent e) 
  {
    System.out.println(&quot;Mouse Released&quot;);
  }
  public static void main(String[] args) 
  {
    MouseListenerEvent mle=new MouseListenerEvent();
  }
}
