public class ArraysAndStuff
{
   public static void main() {
    /*
    for (int i=1; 1 < 20; i++){
        System.out.println("Value is:" + i*5); 
    }
    */
   
   //random double between 90 and 100 inclusive
  
   double num = Math.random()*11;
   
   for (int i=0; i<30; i++){
       num = (int)(Math.random()*11 + 90);
       System.out.println(num);
       System.out.println("Remainder when divided by two is:" + num%2);
    }
   
   /*
   System.out.println(num);
   
   for(int i = 0; i<33; i++){
       System.out.println(Math.random());
    }
   
   
   
   int [] myArray = new int[0];
   //System.out.println(myArray.length);
   
   for(int i=0; i < myArray.length; i++){
       myArray[i] = i*15;
     
   }
      for(int i=0; i < myArray.length; i++){
      // System.out.println("The value is: " + myArray[i]);
     
   }
   */
}
}