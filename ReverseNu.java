package pack3;

public class ReverseNu {

    public static void main(String[] args) {
        int n = 654, rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("reverse number" + rev);
    }
}
