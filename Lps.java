import  java.util.*;
public class Lps{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)) dp[i][j]=dp[i+1][j-1]+2;
                else dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
            }
        }
        System.out.println(dp[0][n-1]);
    }
}