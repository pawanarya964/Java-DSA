// package IF-Else;

public class ValidTriangle {
    public static void main(String[] args) {
        int l = 10;
        int b = 10;
        int h = 10;
        if(l+b>h || b+h>l || l+h>b){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
