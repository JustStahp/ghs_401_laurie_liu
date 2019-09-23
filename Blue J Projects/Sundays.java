
public class Sundays
{
    public static void main()
    {
        int year = 1901;
        int month = 0;
        int day = 2;
        int suns = 0;
        while(year < 2001){
            if (month == 1){
                month++;
                if (day == 0){
                    suns++;
                }  
                if (year % 4 == 0){
                    day++;
                    day %= 7;
                }
            }
            else if (month == 3 || month == 5 || month == 8 || month == 10) {
                if (day == 0){
                    suns ++;
                }
                month++;
                day += 2;
                day %= 7;
            }
            else if (month != 11) {
                if (day == 0){
                    suns ++;
                }
                month++;
                day += 3;
                day %= 7;
            } 
            else {
                if (day == 0 ){
                    suns ++;
                }
                month = 0;
                day += 3;
                day %= 7;
                year ++;
            }
        }
        System.out.print("The number of Sundays is: " + suns);
    }
}