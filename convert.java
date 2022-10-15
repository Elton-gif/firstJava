import java.io.*;   

class convert {  
     
static double Conversion_cm_to_meter(int cm)   {   
double meter;  
meter  = cm/100;    
System.out.printf("Value in meter is: %.2f \n", meter);   
return 0;   
}    

public static void main(String args [])   {   
int cm = 200;   
Conversion_cm_to_meter(cm);   
}  
}  