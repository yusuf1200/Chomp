import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class ChocBar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChocBar extends JButton
{
    // instance variables - replace the example below with your own
    
    private int xc,yc;
    public boolean exists = true;
    public static final Color BROWN = new Color(102,51,0);
      public static final Color PURPLE = new Color(102,0,153);
      

    /**
     * Constructor for objects of class ChocBar
     */
    public ChocBar(int x, int y )
    {
        // initialise instance variables
        super();
        xc = x;
        yc = y;
        
        
        
    }
   public void setColor( int decider)
    {
        Color colour = (int) decider != 0 ? BROWN : Color.PINK;
        if ( decider == 0) 
        {
            this.setLabel("SOAP");
            this.setFont(new Font("Arial", Font.PLAIN, 40));
            this.setForeground(Color.BLACK);
        }
        this.setBackground( colour);
    }
    public int getx()
    {
        return xc;
    }
    public int gety()
    {
        return yc;
    }
    public boolean IsThere()
    {
        return exists;
        
    }
    public void vanish()
    {
        setVisible(false);
        exists = false;
        
    }
    
    

   

}