import java.util.Scanner;

class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            a += s.charAt(s.length() - 1 - i);
        }
        if (a.equals(s))
            return true;
        else
            return false;
    }

    public static boolean isPalindrome1(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        return recur(s, 0);
    }

    public static boolean recur(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        } else if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            return false;
        }
        return recur(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome1(s));
        System.out.println(isPalindrome2(s));
        sc.close();
    }
}