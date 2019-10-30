
public class Compare
{
    public static void main()
    {
        String fruit1 = "pineapple";
        String fruit2 = "Pineapple";
        System.out.println(fruit2);
        fruit2 = fruit2.toLowerCase();
        System.out.println(fruit2);
        System.out.println(fruit1.compareTo(fruit2));
        
        int num = 50;
        
        while (num > 0)
        {
            System.out.println(num);
            num -= 5;
        }
    }
}
