import javax.swing.JOptionPane;
/*
public class StringStuff
{
    public static void main()
    {
        String name = "greg";
        String name2 = JOptionPane.showInputDialog("Name: ");
        int a = 10;
        int b = 10;
        
        if (name.equals(name2))
        {
            System.out.println("They are twins!");
        }else{
            System.out.println("They are NOT twins!");
        }
}
}
*/


public class StringStuff
{
    public static void main()
    {
       String[] classmates = {"Laurie", "Sandra", "Teeeeeeeeeeeeeeeeds", null};
        
       
       for(int i = 0; i < classmates.length; i++){
           if(classmates[i] != null)
           
                System.out.println(classmates[i].length());
       }
}
}