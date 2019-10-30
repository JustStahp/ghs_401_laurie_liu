import java.util.ArrayList;
public class SubstringAndForEach
{
    public static void main()
    {

        
        String animal = "ostrich";

        System.out.println(animal.substring(3, 5));
         

        String [] cereals = {"Frosted Flakes", "Cheerios", "Frosted Mini Wheats", "Cocoa Puffs", "Special K"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Sea Otter");
        animals.add("Whale");
        animals.add("Clownfish");
        animals.add("Shark");

        for(String currCereal: cereals)
        {
            System.out.println(currCereal);
        }
        
        for(String c: cereals)
        {
            c = null;
        }
        
        for(String c: cereals)
        {
            System.out.println(c);
        }
        
        for(String animalia: animals)
        {
            System.out.println(animals);
        }
    }
}
