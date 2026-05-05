import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = sc.next();
        int n = s.length();

        String doubled = s + s;

        Set<Character> set = new HashSet<>();
        int left = 0, sum = 0, maxSum = 0;

        for (int right = 0; right < doubled.length(); right++) {
            char ch = doubled.charAt(right);

            while (set.contains(ch)) {
                char leftChar = doubled.charAt(left);
                sum -= (leftChar - 'a' + 1);
                set.remove(leftChar);
                left++;
            }

            set.add(ch);
            sum += (ch - 'a' + 1);

            if (right - left + 1 > n) {
                char leftChar = doubled.charAt(left);
                sum -= (leftChar - 'a' + 1);
                set.remove(leftChar);
                left++;
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}