import java.util.*;
public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int d=n;
        int l=String.valueOf(n).length();
        for(int i=0;i<l;i++){
            double k=Math.pow(n%10,l);
            sum+=k;
            n/=10;
        }
        if(sum==d){
            System.out.println("Is an Armstrong Number");
        }
        else{
            System.out.println("Is not an Armstrong Number");
        }
        sc.close();
    }
}
