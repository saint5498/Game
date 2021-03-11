import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Application extends JFrame
{
    public JMenuItem user;

    public Application()
    {
        init(new Board());

    }

    public Application(ArrayList<Card>deck)
    {
        init(new Board(deck));

    }

    private void init(Board board)
    {
        add(board);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu"), newGame = new JMenu("New Game"), login = new JMenu("Login");
        JMenuItem i1, i2, i3, i4, i5, i6, login1, login2;

        i1 = new JMenuItem("RandomDeck");
        i2 = new JMenuItem("Same Deck");
        i3 = new JMenuItem("Close");
        i4 = new JMenuItem("Options");
        i5 = new JMenuItem("About");
        i6 = new JMenuItem("High Score");
        user = new JMenuItem();

        login1 = new JMenuItem("Login");
        login2 = new JMenuItem("Logout");
        login.add(login1);
        login.add(login2);

        newGame.add(i1);
        newGame.add(i2);
        menu.add(newGame);
        menu.add(i3);
        menu.add(i4);
        menu.add(i5);
        menu.add(i6);

        i1.addActionListener(new ActionListener() {
           public void actionPerfomed (ActionEvent actionEvent) {
               Run.newApplication();
               dispose();

           }})
         i2.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent actionEvent){
                Run.newApplication(board.deck);
                dispose();
            }});
        i3.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent actionEvent){
                System.exit(0);
            }});
        i4.addActionListener(new ActionListener() {
            public void actionPerfomed (ActionEvent actionEvent){
                if (canOppen)))
                {
                    setEnabled(false);
                    SettingsFrame ex = new SettingsFrame(board);
                    ex.setVisible(true);
                }
            }})
         i5.addActionListener(new ActionListener() {
             public void actionPerformed (ActionEvent actionEvent){
                 if (canOppen)))
                 {
                     setEnable(false);
                     AboutFrame ex = new AboutFrame(board);
                     ex.setVisible(true);
                 }
             }})
         i6.addActionListener(new ActionListener() {
             public void actionPerfomed (ActionEvent actionEvent){
                 if (canOppen())
                 {
                     setEnable(false);
                     HighScoreFrame ex = new HoghtScoreFrame(board);
                     ex.setVisible(true);
                 }
             }});
         login1.addActionListener(new ActionListener() {
             public void actionPerformed (ActionEvent actionEvent) {
                 user.setLabel("not logged in");
                 Run.x = -1;
             }});
         login2.addActionListener(new ActionListener() {
             public void actionPerformed (ActionEvent actionEvent){
                 user.setLabel("not logged in");
                 Run.x = -1;
             }});
         menuBar.add(menu);
         menuBar.add(login);
         menuBar.add(user);

         setMenuBar(menuBar);

         pack();
         setSize(681,700);
         setPreferredSize(new Dimension(681,700));
         setResizable(false);

         setTitle("Solitare");

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
    }

    private boolean canOppen()
    {
        Window[] win = getWindows();
        int show = 0;
        for (int i = 0; i < win.length; i++)
        {
            if (win [i].isShowing())
                   show++;

        }
        if (show > 1)
            return false;
        else
            return true;
    }


}
