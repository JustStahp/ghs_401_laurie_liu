import javax.swing.JOptionPane;
//import java.lang.Math.random();
public class P1E
{

    public static void main()
    {
        int intNum = Integer.parseInt(JOptionPane.showInputDialog("Pick a number betwen 10 and 20?"));
        //int random = (intNum)*Math.random;
        int maximum = 19;
        int minimum = 12;
        int max = 0;
        int min = 100;
        while (intNum < 10 || intNum > 10000 )
        {
            intNum = Integer.parseInt(JOptionPane.showInputDialog("Incorrect, enter a number between 10 and 20."));
            
            
        }
        int[] numArray = new int[intNum];
        for (int i = 0; i < intNum; i++)
                {
                 numArray[i] = (int) (Math.random() * (maximum - minimum +1) + minimum);
                 System.out.print(numArray[i] + " ");
                 if(numArray[i]>max){
                     max = numArray[i];
                 }
                 if (numArray[i]< min){
                    min = numArray[i];
                    }
        }
        System.out.println("\nGreatest " + max);
        System.out.print("Lowest " + min);
    }
}
