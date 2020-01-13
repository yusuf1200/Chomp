import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * Write a description of class Window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Layout extends JFrame 
{
    // instance variables - replace the example below with your own
    
    private JPanel bottomPanel, topPanel;
    private ChocBar [][] bar;
    private int x,y;
    private JButton btn1,btn2,btn3;
    private JLabel lbl;
    private int column, row;
    private int a,b;
    private int move;
    

    /**
     * Constructor for objects of class Window
     */
    public Layout(int x , int y)
    {
        // initialise instance variables
      
        this.x = x;
        this.y = y;
        setSize(400, 2000);
        setTitle("Chomp");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        lbl = new JLabel("Choose any of the following Grid");
        
       
        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        btn1 = new JButton("5 x 4");
        btn2 = new JButton("5 x 5 ");
        btn3 = new JButton("5 x 3");
        btn1.addActionListener(new Action());
        btn2.addActionListener(new Action());
        btn3.addActionListener(new Action());
        
        topPanel.add(lbl);
        topPanel.add(btn1);
        topPanel.add(btn2);
        topPanel.add(btn3);
        c.add(topPanel,BorderLayout.NORTH);
        
        
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(x,y));
        c.add(bottomPanel,BorderLayout.CENTER);
        
        
      
        
      
        
        
      
        
        
        
     
        
        bar  = new ChocBar[x][y];
        for ( int column = 0; column < x; column ++)
        {
            for ( int row = 0; row < y; row ++)
            {
                
                bar [column][row] = new ChocBar(column,row);
                bar[column][row].setColor(column+row);
                int a = column;
                int b = row;
                bar[column][row].addActionListener(new Action());
               
                
                //bar[column][row].addActionListener( e ->
               
                  //   {   
                  //      for ( int num1 = a; num1 < x; num1++)
        //  {
        //      for ( int num2 = b; num2 < y; num2++)
        //      {
        //          bar[num1][num2].setSize(0,0);
        //      }
                        
                  //  }
                    
               // }//);
               
               
                
                
                bottomPanel.add(bar[column][row]);
              
            }
        }
        
      
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        pack();
        
        Random Who = new Random();
        
        
        int move = Who.nextInt(2);
        if( move == 0 )
        {
            Comp();
            
        }
        
        
       
    }
    public boolean Run()
    {
        for(int col = 0;col<x;col++)
        {
            for(int row = 0;row<y;row++)
            {
                boolean soap = !(col == 0 && row == 0);
                if(bar[col][row].IsThere() && soap)
                {
                    return true;
                }
                
                
    }
       }
     return false;
    }
    public void EatChoc(int posx,int posy)
    {
         for(int col = posx;col<x;col++)
        {
            for(int row = posy;row<y;row++)
            {
                bar[col][row].vanish();
        
        
    }
}
}
public void user(int posx,int posy)
{
    if(Run())
    {
        
        boolean soap = !(posx == 0 && posy ==0 );
    if((bar[posx][posy].IsThere() && soap))
    {
        EatChoc(posx,posy);
        
        
    }
   
}
if(posx == 0 && posy ==0 && move == 0)
{
   
        JOptionPane.showMessageDialog(null, "You are left with the soap, you lost !", "Message", JOptionPane.INFORMATION_MESSAGE);
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Would you like to play again?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION); 
if (selectedOption == JOptionPane.NO_OPTION) {
    System.exit(1);
}
else
{
     Layout demo = new Layout( 5, 5);
        demo.setSize(800, 800);
        demo.setLocation(600,200);
    
}
    
}

}
public void Comp()
{
    
    Random gridpos = new Random();
    int c1 = gridpos.nextInt(this.x);
    int r1 = gridpos.nextInt(this.y);
    
    if(Run())
    {
        
        
        while(true)
  {
      boolean soap = !(c1 == 0 && r1 == 0);
        
    if( (bar[c1][r1].IsThere()) && soap)
    {
        EatChoc(c1, r1);
        break;
        
        
        
    }
    else
    {
         c1 = gridpos.nextInt(this.x);
         r1 = gridpos.nextInt(this.y);
        
    }
   
    
    
}

        
}
else
{
    
    
    
        JOptionPane.showMessageDialog(null, "Computer is left with the soap , you won !", "Message", JOptionPane.INFORMATION_MESSAGE);
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                                  "Would you like to play again?", 
                                  "Choose", 
                                  JOptionPane.YES_NO_OPTION); 
if (selectedOption == JOptionPane.NO_OPTION) {
    System.exit(1);
}
else
{
     Layout demo = new Layout( 5, 5);
        demo.setSize(800, 800);
        demo.setLocation(600,200);
    
}
    
}
}
    public class Action implements ActionListener
    {
       
            
        
        
    
    
        
        public void actionPerformed(ActionEvent e)
        {
            Object selected = e.getSource();
            
           
            
            
            
            
            
            
            
            if(e.getSource() == btn2 )
            {
                Layout demo = new Layout( 5, 5);
        demo.setSize(800, 800);
        demo.setLocation(600,200);
        
                
            }
            if(e.getSource() == btn3)
            {
                Layout demo = new Layout( 5, 3);
        demo.setSize(800, 800);
        demo.setLocation(600,200);
                
            }
            if(e.getSource() == btn1 )
            {
                Layout demo = new Layout( 5, 4);
        demo.setSize(800, 800);
        demo.setLocation(600,200);
                
            }
            if (selected instanceof ChocBar)
            {
                //for(int x1 = ((ChocBar)selected).getx(); x1 < x; x1++)
                //{
                    //for(int x2 = ((ChocBar)selected).gety();x2<y;x2++)
                    //{
                        
                     //   bar[x1][x2].setVisible(false);
                    //}
                //}
                user((((ChocBar)selected).getx()),(((ChocBar)selected).gety()) );
               // if(((ChocBar)selected).getx() ==0 && (((ChocBar)selected).gety()) == 0 )
                //{
                  //   JOptionPane.showMessageDialog(null, "You are left with the black piece , you lost !", "Click on the grid size to play again", JOptionPane.INFORMATION_MESSAGE);
                    
                //}
                
                Comp();
                 //if(((ChocBar)selected).getx() ==0 && ((((ChocBar)selected).gety()) == 0) && move == 0 )
                 //{
                //JOptionPane.showMessageDialog(null, "Computer is left with the black piece , you won !", "Click on the grid size to play again", JOptionPane.INFORMATION_MESSAGE);
        
            }               
                
                
            }
            
           
        
        /*
         * I'm using instanceof here so that I can easily cover the selection of any of the gridsquares
         * with just one piece of code.
         * In a real system you'll probably have one piece of action code per selectable item.
         * Later in the course we'll see that the Command Holder pattern is a much smarter way to handle actions.
         */
        
        // if a gridsquare is selected then switch its color
        
        
        
        }
                
            
        }
    
    

    




             
             

                