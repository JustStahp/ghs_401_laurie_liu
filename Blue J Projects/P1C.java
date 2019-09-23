import javax.swing.JOptionPane;
public class P1C
{
    public static void main()
    {
        String school1 = "Granada";
        String mascot1 = "Matadors";
        String school2 = JOptionPane.showInputDialog("What school do you go to? (CASE SENSITIVE)");
        String mascot2 = JOptionPane.showInputDialog("What mascot do you have? (CASE SENSITIVE)");
        if (school1.equals(school2))
        {
            System.out.println("Access granted! Correct school!");
        }else{
            System.out.println("Nope, wrong school.");
        
        }
        if (mascot1.equals(mascot2))
        {
            System.out.println("Access granted! Correct mascot!");
        }else{
            System.out.println("Nope, wrong mascot.");
        
        }
        
        if (mascot1.equals(mascot2) && (school1.equals(school2)))
        {
            System.out.println("All correct!");
            String[] aceAttorney = {" ", "Maya Fey", "Miles Edgeworth", null, "Phoenix Wright", "Dick Gumshoe"};
            for(int i = 0; i < aceAttorney.length; i++) {
                if (aceAttorney[i] == null){
                    System.out.println("This spot is empty.");
                }
                
                else if (aceAttorney[i] .equals( "Phoenix Wright")){
                    System.out.println("You found Phoenix!");
                } else {
                    System.out.println("This is not Phoenix. This is " + aceAttorney[i]);
                //} if (aceAttorney[i] == null) {
                //    System.out.println("There is no one in this spot (null).");
                }
            }
        }else{
            System.out.println("Try again.");
        
        }
        String vidgame1 = "Ace Attorney";
        String vidgame2 = JOptionPane.showInputDialog("What's your favorite video game?");
        if (vidgame1.equals(vidgame2))
                {
                    System.out.println("I respect you.");
                }else{
                    System.out.println("I do not respect you.");
                
                }
}
}