import java.util.*;

public class octaltodecimal{
 public static int octToDec(int n){
    int i=0;
    int dec=0;
    while(n>0){
        int ld=n%10;
        dec=dec+(ld*(int)Math.pow(8,i));
        i++;
        n=n/10;
    }
    return dec;
 }

 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter n:");
  int n=sc.nextInt();

  int decnum=octToDec(n);
  System.out.println("Decimal no.:"+decnum);
 }
}
   
    

