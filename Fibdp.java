   import java.util.*;
public class Fibdp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)return;
        int[] fib=new int[n];
        if(n>1)fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.print(fib[i]+" ");
        }
        sc.close();
    }
}
