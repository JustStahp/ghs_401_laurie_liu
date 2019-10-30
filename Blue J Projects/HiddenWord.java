
public class HiddenWord
{
    private String guess;
    String word = " ";
    /* public String getHint()
    {
    String word = " ";

    boolean blap = word.contains("H");
    boolean blep = word.contains("A");
    boolean blip = word.contains("R");
    boolean blop = word.contains("P");
    boolean blup = word.contains("S");

    for (int i = 0; i < word.length(); i++)
    {
    if (word.substring(i, i+1).equals(word.substring(i, i+1)))
    {
    System.out.println(blap);

    return word;
    }
    }
    return word;
    }
     */

    public String getHint(String guess)
    {
        this.guess = guess;

        if (guess.equals(this.word))
        {
            
            for (int i = 0; i<guess.length(); i++)
            {
                if (this.word.substring(i, i+1).equals(guess.substring(i, i+1)))
                {
                    word += guess.substring(i, i+1);
                } else if (this.word.contains(guess.substring(i, i+1))){
                    word += "+";
                }else{
                    word += "*";

                }
            }
           
        }
         return word;
    }
} // end class HiddenWord
