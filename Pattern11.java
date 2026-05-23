import java.util.*;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i%2==0 && j%2==0) k=1;
                else if(i%2!=0 && j%2==0) k=0;
                else if(i%2!=0 && j%2!=0) k=1;
                else k=0;
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
