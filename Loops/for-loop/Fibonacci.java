// package Loops.for-loop;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ft = 0;
        int st = 1;
        for(int i=0; i<=n; i++){
            int tt = ft+st ;
            if(i==n){
                System.out.println(tt);
            }
            ft = st ;
            st = tt ;
        }
    }
}
