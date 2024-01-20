import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class Main {
//    Bai Tap 1
    public static boolean isPrime (long n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
//    Bai Tap 1
    public static boolean isFibo(long n) {
        if(n == 0 || n == 1) {
            return true;
        }
        long f0 = 0, f1 = 1;
        for(int i = 2; i <= 90; i++) {
            long f = f0 + f1;
            if(f == n) {
                return true;
            }
            f0 = f1;
            f1 = f;
        }
        return false;
    }
//    Bai Tap 2
    public static String convertString(String s) {
        String token[] = s.trim().split("\\s+");
        String result = "";
        for(int i = 0; i < token.length; i++) {
            result += token[i] + " ";
        }
        return result.trim();
    }
//    Bai Tap 3
    public static int countCharacter(String s1, String s2) {
        int cnt = 0;
        Set<Character> se = new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++) {
            se.add(s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++) {
            if(se.contains(s2.charAt(i))) {
                ++cnt;
                se.remove(s2.charAt(i));
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Bai Tap 1
        long n = sc.nextLong();
        if(isFibo(n) && isPrime(n)) {
            System.out.println("So hoan hao");
        }
        else {
            System.out.println("So khong hoan hao");
        }
        sc.nextLine();
//        Bai Tap 2
        String s = sc.nextLine();
        System.out.println(convertString(s));
//     Bai Tap 3
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        System.out.println(countCharacter(s1, s2));
    }
}