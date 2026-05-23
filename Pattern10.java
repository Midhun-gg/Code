import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=2*n;i++){
            int k=(i>n)?(2*n-i):i;
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
