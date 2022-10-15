import java.io.*;  
import java.util.*;
public class circum{
    public static void main(string[] args){
        float r, cc;
        Scanner inbut = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");

        r = inbut.nextFloat();

        cc = (float)(2*3.14*r);
        System.out.println("\n Circumference ="+ cc);
    }
}