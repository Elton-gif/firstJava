import java.util.*;
public class circle
{
    public static void main(String[] args) 
    {
        int rinner,router;
        double pi = 3.14, outarea,inarea,middlearea;
        Scanner in = new Scanner(System.in);
        Scanner out = new Scanner(System.in);
       
        System.out.print("Enter radius of inner circle:");
        rinner = in.nextInt();
        System.out.print("Enter radius of outer circle:");
        router = out.nextInt();
        inarea = pi * rinner * rinner;
        outarea = pi*router*router;
        middlearea = outarea-inarea;

        System.out.println("Area of middle circle circle:"+middlearea);
    }            
}