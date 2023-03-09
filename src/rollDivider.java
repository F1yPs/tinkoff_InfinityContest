import java.util.Scanner;
import java.lang.Math;

public class rollDivider {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int countCut = 0;
        for (int i = n; i > 1; i = (int) Math.ceil(i/2.0), countCut++) {}
        System.out.println(countCut);
        //        System.out.println(searchRollDivider(n);
    }

//    private static int searchRollDivider(int n) {
//        if (n == 1) return 0;
//        else return searchRollDivider( Math.ceilDiv(n , 2), 1);
//    }
//
//    private static int searchRollDivider(int n, int count) {
//        if (n == 1) return count;
//        else return searchRollDivider(Math.ceilDiv(n , 2), ++count);
//    }
}
