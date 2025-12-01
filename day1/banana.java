import java.util.Scanner;

public class banana {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int k=sc.nextInt();
     int n=sc.nextInt();
     int w=sc.nextInt();
     int sum=0;
     for(int i=1;i<=w;i++)
     {
         sum+=i*k;
     }
     int borro= sum-n;
     if(borro<0)
         {
         System.out.println(0);
         }
     else
         {
         System.out.println(borro);
         }
 sc.close();
        }
}
