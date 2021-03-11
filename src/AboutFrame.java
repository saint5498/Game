import javax.swing.*;
import java.awt.event.WindowListener;


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class AboutFrame extends JFrame implements WindowListener
{
    private Board board;
    public AboutFrame(Board b)
    {
        board=b;
        add(new AboutPanel(this));
        addWindowListener(this);
        setAlwaysOnTop(true);

        pack();
        setSize(650,525);
        setPreferredSize(new Dimension(650,525));
        setResizable(false);

        setTitle("About Program");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void windowDeactivated(WindowEvent e)
    {}

    public void windowActivated(WindowEvent e)
    {}

    public  void windowDeiconified(WindowEvent e)
    {}

    public void windowIconified(WindowEvent e)
    {}

    public  void windowClosing(WindowEvent e)
    {}

    public  void  windowClosed(WindowEvent e)
    {
        board.play = true;
        Window[] win = getWindows();

        for (int i = 0; i < win.length; i++)
        {
            if (win[i].getClass().getName().equals("Application"))
                win[i].setEnabled(true);
        }
    }

    public void windowOpened(WindowEvent e)
    {
        board.play = false;
    }
}
