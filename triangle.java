import java.util.*;
class triangle{
    public static void main(String [] args) {
        // declaring a variable
        double a,b,c,perimeter,area,s,hold;
        Scanner inputa = new Scanner(System.in);
        Scanner inputb = new Scanner(System.in);
        Scanner inputc = new Scanner(System.in);
        System.out.print("Enter dimesnion a: ");
        a = inputa.nextFloat();
        System.out.print("Enter dimesnion b: ");
        b = inputb.nextFloat();
        System.out.print("Enter dimesnion c: ");
        c = inputc.nextFloat();
        perimeter = a+b+c;
        s = (a+b+c)/2;
        hold = s*((s-a)*(s-b)*(s-c));
        area = Math.sqrt(hold);

        System.out.println(" area --->"+ area);
        System.out.println("perimeter  --->"+ perimeter);
      

    }
}