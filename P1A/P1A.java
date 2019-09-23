import javax.swing.JOptionPane;
import java.lang.Math;
public class P1A
{ public static void main(){
    int a = Integer.parseInt(JOptionPane.showInputDialog("Give me a:"));   
    int b = Integer.parseInt(JOptionPane.showInputDialog("Give me b:"));   
    int c = Integer.parseInt(JOptionPane.showInputDialog("Give me c:"));  
    double bb = b*b;
    double ac = 4*a*c;
    double sq = Math.sqrt((bb)-(ac));
    double ans1 = (-b+sq)/(2*a);
    double ans2 = (-b-sq)/(2*a);
    if(bb-ac < 0){
        System.out.println("Not an Answer");
    }
    else{
    System.out.println("b squared is: " + bb);
    System.out.println("4 * a * c: " + ac);
    System.out.println(sq);
    System.out.println("First Root:" + ans1);
    System.out.println("Second Root:" + ans2);
}
    
}
}