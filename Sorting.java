import java.util.*;

public class Main{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Array size:");
     int n = sc.nextInt();
     System.out.println("Enter Array Elements:");
     int ar[] = new int[n+1];
     for(int i=0;i<n;i++){
         ar[i] = sc.nextInt();
     }
     System.out.println("Enter a number:");
     int x = sc.nextInt();
     Arrays.sort(ar);
     System.out.println("Sorted Array:");
     for(int i=0;i<n;i++){
         System.out.print(ar[i]+" ");
     }
     System.out.println();
     int count = 0;
     for(int i=0;i<n;i++){
        if(arr[i] > x){
             break;
        }
        if(arr[i] == x){
             count += 1;
        }
      }
      System.out.println("Number of occurences:" + count);
    }
}