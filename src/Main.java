import java.util.Scanner;

public class Main {
    public static boolean isPrime (long n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
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
    public static String convertString(String s) {
        String token[] = s.trim().split("\\s+");
        String result = "";
        for(int i = 0; i < token.length; i++) {
            result += token[i] + " ";
        }
        return result.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(isFibo(n) && isPrime(n)) {
            System.out.println("So hoan hao");
        }
        else {
            System.out.println("So khong hoan hao");
        }
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(convertString(s));
    }
}