// package IF-Else;
import java.util.*;
public class CalPercGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Physics: ");
        int ph=sc.nextInt();
        System.out.print("Chemistry: ");
        int ch=sc.nextInt();
        System.out.print("Biology: ");
        int bio=sc.nextInt();
        System.out.print("Computer: ");
        int co=sc.nextInt();
        System.out.print("Maths: ");
        int mt=sc.nextInt();
        int tt = ph+ch+bio+co+mt ;
        System.out.println("Total Marks: "+ tt + "/500");
        int perc = ((tt*100)/500);
        System.out.println("Percent: "+ perc);
    }
}
