import  javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;

public class AboutPanel extends JPanel implements ActionListener
{
    private JFrame frame;
    private JTextArea text;
    private JButton ok;

    public AboutPanel(JFrame frameIn)
    {
        frame = frameIn;
        text = new JTextArea(20,50);
        text.setLineWrap(true);
        text.setEditable(false);
        text.setWrapStyleWord(true);

        Scanner input;
        try{
            input = new Scanner (new File("about.txt"));
            String str = input.nextLine();

            while (input.hasNextLine())
            {
                str += "\n\n";
                str += input.nextLine();
            }

            text.setText(str);
            add(text);
            input.close();
        }
        catch (Exception e)
        {}

        ok = new JButton("OK");
        ok.addActionListener(this);
        ok.setActionCommand("ok");
        add(ok);
    }

    public  void  actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand().equals("ok"))
            frame.dispose();
    }
}
