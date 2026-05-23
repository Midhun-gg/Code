import java.util.*;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            char c='A';
            for(int k=2*i;k>1;k--){
                System.out.print(c);
                if(k>i+1) c++;
                else c--;
            }
            System.out.println();
        }
        sc.close();
    }
}
