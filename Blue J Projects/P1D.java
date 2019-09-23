import java.util.Random;
public class P1D
{
    public static void main()
    { 
        boolean stop=true;
        int a = 1;
        int b = 0;
        int d = 0;
        String movies[] = {"dumb and dumber" , "tommyboy" , "shawshank redemption"};
        String songs[] = {"rudolph" , "jingle bells" , "frosty the snow man"};
        for(int i = 0; i < 10; i++){
            System.out.print(a + "\t\t");
            System.out.print(a*a + "\t\t");
            
            b = getRandomNumberInRange(a, a*a);
            if(b==a){
                System.out.println(b + "\t\t" + "The random value is equal to the index");
            }
            else if(b==a*a){
                System.out.println(b + "\t\t" + "The random value is equal to the square of the index");
            }
            else{
                System.out.println(b);
            }
            a++;
            
            
        }
        for(int i=0; i<movies.length; i++){
            System.out.println(movies[i]);
        }
        System.out.print("\n"+ "\n");
        while(d<songs.length){
                
                System.out.print(songs[d]);
                d++;
                
               
                if(d<songs.length){
                    System.out.print(",");
                }
                
        }
        
        
        
        
        int x = 0;
        int y = 0;
        int z = 0;
        for(int k=0; k<500; k++){
            x++;
            for(int g=0; g<500; g++){
                y++;
                for(int j=0; j<500; j++){
                    z++;
                   
                    if(x*x + y*y  == z*z){
                       System.out.println(x + "\t" + y + "\t" + z);
                       break;
                    }
            
                }
            
            }
        }
    }
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
 }
