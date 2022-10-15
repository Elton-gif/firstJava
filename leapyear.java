import java.util.*;
class leapyear{
    public static void main(String [] args){
        double leap,rem;
        int year;
        Scanner inputYear = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = inputYear.nextInt();
        rem = year%4;
        if(rem ==0){
            if(year%100 ==0){
            System.out.println(year + " is a leap year");
            }
            else{
            System.out.println(year + " is not a leap year");

            }

        }
        else{
            System.out.println(year + " is not a leap year");

        }
        



        
    }
}