import javax.swing.JOptionPane;

public class InputOutput
{ public static void main(){
        String name = JOptionPane.showInputDialog("What is your name?");    
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));   
        
        if(age > 15){
            System.out.println("You can drive, " + name + "!");
        }
        else{
            System.out.println("Nice bike, " + name + "!");
            
    }
  
}
}