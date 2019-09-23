
public class PythagTriplets
{
    public static void main()
    {
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                double c = Math.sqrt((a*a) + (b*b));
                if (a + b + c == 1000){
                    System.out.println(a*b*c);
                    System.out.print("a is: " + a + " b is: " + b + " c is: " + c);
                    return;
                }
            }
        }
    }
}


// you need a < b < c

// a^2 + b^2 = c^2

//go through all numbers (0 -> 1000) for each letter until triplet is found when 
//all added is equal to 1000