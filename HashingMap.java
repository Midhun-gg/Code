import java.util.HashMap;
import java.util.Scanner;

public class HashingMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(map.getOrDefault(sc.nextInt(), 0));
        }
        sc.close();
    }
}
