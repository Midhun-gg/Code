import java.util.*;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<2*n;i++){
            int a;
            if(i<=n)a=i;
            else a=2*n-i;
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            for(int k=2*a;k<2*n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
