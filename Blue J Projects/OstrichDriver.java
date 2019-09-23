
public class OstrichDriver
{

    public static void main()
    {
        Ostrich o1 = new Ostrich("Australia", 9.0);
        double currentHeight = o1.getHeight();
        currentHeight += 0.1;
        o1.setHeight(currentHeight);
        System.out.println(o1.getHeight());
        /*
        System.out.println(o1.toString());
        o1.setHeight(9.1);
        o1.setCountry("U.S.");
        System.out.println(o1.toString());
        System.out.println(o1.getCountry());
        */
        Ostrich[] ostrichArray= new Ostrich[3];
        ostrichArray[0] = new Ostrich ("Australia", 9.2);
        ostrichArray[1] = new Ostrich ("U.S.", 9.1);
        ostrichArray[2] = new Ostrich ("Canada", 9.0);
        for (int i = 0; i<ostrichArray.length; i++)
        {
            System.out.println(ostrichArray[i]);
        }
    }
}
