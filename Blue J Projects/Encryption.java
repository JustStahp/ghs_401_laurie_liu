import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Encryption
{

    public static void main()
    {
        String phrase = JOptionPane.showInputDialog("Please enter a phrase to encrypt");
        int push = 0;

        System.out.println(caesarEncrypt(phrase, push));

        String phrase2 = JOptionPane.showInputDialog("Please enter a phrase to decrypt");

        System.out.println(caesarDecrypt(phrase2, push));
    }

    public static String caesarDecrypt(String phrase2, int push)
    {
        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        alpha.add("e");
        alpha.add("f");
        alpha.add("g");
        alpha.add("h");
        alpha.add("i");
        alpha.add("j");
        alpha.add("k");
        alpha.add("l");
        alpha.add("m");
        alpha.add("n");
        alpha.add("o");
        alpha.add("p");
        alpha.add("q");
        alpha.add("r");
        alpha.add("s");
        alpha.add("t");
        alpha.add("u");
        alpha.add("v");
        alpha.add("w");
        alpha.add("x");
        alpha.add("y");
        alpha.add("z");

        String newPhrase = "";

        //iterate and isolate each letter in phrase

        for(int i = 0; i < phrase2.length(); i++)
        {
            String letter = phrase2.substring(i, i+1); //pull each letter

            int spot = alpha.indexOf(letter); //find letter in list

            System.out.println(spot);

            spot -= push; //increase index by the push value

            newPhrase += alpha.get(spot); //adds letter according to spot
        }
        return newPhrase;
    }

    public static String caesarEncrypt(String phrase, int push)
    {
        ArrayList<String> alpha = new ArrayList<String>();
        alpha.add("a");
        alpha.add("b");
        alpha.add("c");
        alpha.add("d");
        alpha.add("e");
        alpha.add("f");
        alpha.add("g");
        alpha.add("h");
        alpha.add("i");
        alpha.add("j");
        alpha.add("k");
        alpha.add("l");
        alpha.add("m");
        alpha.add("n");
        alpha.add("o");
        alpha.add("p");
        alpha.add("q");
        alpha.add("r");
        alpha.add("s");
        alpha.add("t");
        alpha.add("u");
        alpha.add("v");
        alpha.add("w");
        alpha.add("x");
        alpha.add("y");
        alpha.add("z");

        String newPhrase = "";

        //iterate and isolate each letter in phrase

        for(int i = 0; i < phrase.length(); i++)
        {
            String letter = phrase.substring(i, i+1); //pull each letter
            String result = null;
            int spot = alpha.indexOf(letter); //find letter in list

            if (spot == -1) //letter not in list
            {
                newPhrase += letter;
            } 
            else
            {
                spot += push;

                spot %=alpha.size();
                newPhrase += alpha.get(spot);
            }

            //System.out.println(spot);

            //spot += push; //increase index by the push value

             //adds letter according to spot
        }
        return newPhrase;
    }
}
