// package Loops.for-loop;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num: ");
        int n=sc.nextInt();
        int count = 1 ;
        for(int i=1; i<=n; i++){
            count = count*i ;
            if(i==n){
                System.out.println(count);
            }
        }
    }
}
