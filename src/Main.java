import java.util.Scanner;


// для сдачи заданий (шаблон)
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int d = console.nextInt();

        if (d > b) {
            c *= (d - b);
            System.out.println(a + c);
        } else System.out.println(a);
    }
}
