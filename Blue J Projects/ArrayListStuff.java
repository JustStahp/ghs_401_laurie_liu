import java.util.ArrayList;
public class ArrayListStuff
{
    public static void main()
    {
        ArrayList<String> stateList = new ArrayList <String>();
        
        stateList.add("California");
        stateList.add("Nevada");
        stateList.add("Oregon");
        stateList.add("Arizona");
        stateList.add("Washington");
        
        for(int i = 0; i < stateList.size(); i++)
        {
            System.out.println(stateList.get(i));
        }
        System.out.println("Messing with the arrayList. . .");
        
        //stateList.add(1,"Arkansas");
        //stateList.remove(4);
        //stateList.set(3, "Texas");
        
        for(int i = 0; i < stateList.size(); i++)
        {
            if (stateList.get(i).contains("n"))
            {
                //boolean hasLetter = stateList.contains("n");
                stateList.remove(i);
                i--;
            }
        }
        for(int i = 0; i < stateList.size(); i++)
        {
            System.out.println(stateList.get(i));
        }
        
    }
}
