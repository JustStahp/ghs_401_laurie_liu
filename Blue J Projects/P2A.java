import javax.swing.JOptionPane;

public class P2A
{
    public static void main()
    {
        String[] friend1 = new String[3];
        String[] friend2 = new String[3];
        
        persons1[0] = JOptionPane.showInputDialog("Enter first name for person 1");
        persons1[1] = JOptionPane.showInputDialog("Enter middle name for person 1");
        persons1[2] = JOptionPane.showInputDialog("Enter last name for person 1");
        int persons1Age = Integer.parseInt(JOptionPane.showInputDialog("Input age for person 1"));

        persons2[0] = JOptionPane.showInputDialog("Enter first name for person 2");
        persons2[1] =JOptionPane.showInputDialog("Enter middle name for person 2");
        persons2[2] = JOptionPane.showInputDialog("Enter last name for person 2");
        int persons2Age = Integer.parseInt(JOptionPane.showInputDialog("Enter age for person 2"));

        int persons1Length = 0;
        for (String name : persons1)
        {
            persons1Length =+ name.length();
        }
        int persons2Length = 0;
        for (String name : persons2)
        {
            persons2Length =+ name.length();
        }

        if (persons1Length > persons2Length)
            System.out.println("Friend one has a longer name!");

        else
            System.out.println("Friend two has a longer name!");

        otherThing persons1 = new otherThing(persons1[0], persons1[1], persons1[2], persons1Age);
        otherThing persons2 = new otherThing(persons2[0], persons2[1], persons2[2], persons2Age);
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}