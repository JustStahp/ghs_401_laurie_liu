import java.util.ArrayList;
public class P3E
{
    public static void main()
    {
        ArrayList<String> elementList = new ArrayList<String>();
        elementList.add("argon");
        elementList.add("boron");
        elementList.add("carbon");
        elementList.add("fluorine");
        elementList.add("gold");
        elementList.add("iron");
        elementList.add("livermorium"); 

        System.out.println("Here are the elements:");
        System.out.println(" ");

        for(int i = 0; i < elementList.size(); i++)
        {
            System.out.println(elementList.get(i));
        }

        elementList.add(1, "bismuth");
        elementList.set(3, "cobalt");

        System.out.println(" ");
        System.out.println("Here are the elements with some changes:");
        System.out.println(" ");
        for(int i = 0; i < elementList.size(); i++)
        {
            System.out.println(elementList.get(i));
        }
        System.out.println(" ");
        for(int i=elementList.size()-1; i>-1; i--)
        {
            if (elementList.get(i).contains("on"))
            {
                System.out.println(elementList.get(i));
            }
            
        }
        System.out.println(" ");

        for (int i=elementList.size()-1; i>-1; i--){
            if (elementList.get(i).compareTo("d")>0){
                elementList.remove(i);
            }

            
        
        }
        
        for (int i=0; i<elementList.size(); i++){
            System.out.println(elementList.get(i));
        }
    }
}
