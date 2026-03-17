import java.util.Scanner;

public class HashingBasicchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] hasharr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hasharr[s.charAt(i)-'a']++;
        }
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(hasharr[sc.next().charAt(0)-'a']);
        }
        sc.close();
    }
}
