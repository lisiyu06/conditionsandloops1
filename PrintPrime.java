package package1;

/**
 * Author: lisiyu
 * Created: 2019/10/21
 */
public class PrintPrime {
    public static void main(String[] args) {
        int i = 0;
        for (int num = 1; num <= 100; num++) {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                System.out.println(num);
            }
        }
    }
}
