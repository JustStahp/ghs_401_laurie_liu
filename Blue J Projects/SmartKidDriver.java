

public class SmartKidDriver
{  
    public static void main()
    {
        double[] myGrades = new double[]{4.0, 4.0, 4.0, 4.0, 4.0};
        SmartKid k1 = new SmartKid(myGrades);
        System.out.println(k1.calcGPA());
    }

}
