
public class GhostDriver
{
    public static void main(){
        int num = 7;
        Ghost g1 = new Ghost();
        Ghost g2 = new Ghost();
        Ghost g3 = new Ghost();
        
        System.out.println(g2);
        
        Ghost g4 = new Ghost("Chartreuse ", 99, 10);
        System.out.println(g4.toString());
        g4.bumpSpeed(7);
        System.out.println(g4.toString());
        g4.bumpSpeed(); //increase speed by one
        System.out.println(g4.toString());
        
        g4.doubleColor();
        
        System.out.println(g4.toString());
    }
}
