import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(rgcd(a,b));
        sc.close();
    }
    public static int gcd(int a,int b) {
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public static int rgcd(int a,int b) {
        if(b==0) return a;
        return rgcd(b,a%b);
    }
}
