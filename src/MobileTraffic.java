
import java.util.Scanner;

public class MobileTraffic {
    public static void main(String[] args) {
        System.out.println(PaymentRate());
    }

    private static int PaymentRate() {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int d = console.nextInt();

        if (d > b) {
            c *= (d - b);
            return a + c;
        } else return a;
    }
}
