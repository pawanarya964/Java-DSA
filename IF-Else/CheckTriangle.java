// package IF-Else;
public class CheckTriangle {
    public static void main(String[] args) {
        int l = 10 ;
        int b = 20 ;
        int h = 30 ;
        if(l==b && l==h){
            System.out.println("Equilateral");
        }else if(l==b || b==h || h==l){
            System.out.println("Isoscales");
        }else{
            System.out.println("Scalen");
        }
    }
}
