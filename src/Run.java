import javafx.application.Application;
import javafx.stage.Stage;

import javax.smartcardio.Card;
import java.util.*;

public class Run 
{
    public static int x=-1; //user that is logged in
    private static Application window = null;
    
    
    //main method of the application
    public static  void main (String [] arg)
    {
        newApplication();
    }
    //create new window gets rid of the old one
    private static void newApplication()
    {
        if  (window != null)
        {
            window.dispose();
            window = null;

        }
        window = new Application(deck);
        window.setVisible(true);

    }

    public static void newApplication(ArrayList<Card>deck)
    {
        if (window != null)
        {
            window.dispose();
            window = null;

        }
        window = new Application(deck);
        window.setVisible(true);
    }
    public static void resize()
    {
        String str, value;
        int num = 1, charge = 0;
        char suit = 'h';
        for (int i = 0; i <52; i++)
        {
            value = Integer.toString(num);
            str = "sips -z 91 63 Cards/" + value + suit +".png";
            try{
                Runtime.getRuntime().exec(str);
            }
            catch (Exception e){}
            num++;
            if(num ==14)
            {
                num = 1;
                charge ++;
            }
            if (charge == 1)
                suit = 'C';
            else if (charge ==2)
                suit = 'D';
            else if (change ==3)
                suit ='S';
        }


    }
}

