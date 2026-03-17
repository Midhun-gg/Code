import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        int a=0,b=1;
        while(n-->0){
            int temp=a;
            a=b;
            b+=temp;
        }
        return a;
    }
    public static int fib1(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        System.out.println(fib1(n));
        sc.close();
    }
}
